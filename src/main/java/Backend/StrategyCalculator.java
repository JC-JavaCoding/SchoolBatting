/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jjaac
 */
public class StrategyCalculator
{
    //Main string to return:
    public static String strats;
    //numStrategies used in the creation of the array form of the strategies
    private static int numStrats = 0;
    //info file:
    final static File infoFile = new File("data\\info.txt");
    
    //backend used to write the information to the "info" text file, data from the User_Tyre_InputScreen
    public static void printInfo(String sLap1Str, String mLap1Str, String hLap1Str,
                                    String sLastLapStr, String mLastLapStr, String hLastLapStr,
                                    String sMaxLapsStr, String mMaxLapsStr, String hMaxLapsStr,
                                    String raceDistStr, String pitTimeStr)
    {
        PrintWriter info = null;
        try 
        {
            info = new PrintWriter(infoFile);
            info.print(sLap1Str +"#"+ mLap1Str +"#"+ hLap1Str +"#"+ sLastLapStr +"#"+ mLastLapStr +"#"+ hLastLapStr +"#"+ sMaxLapsStr +"#"+ mMaxLapsStr +"#"+ hMaxLapsStr +"#"+ raceDistStr +"#"+ pitTimeStr);
            info.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "File not found exception");
        }
    }
    public static boolean inputsViable(String sLap1Str, String mLap1Str, String hLap1Str,
                                    String sLastLapStr, String mLastLapStr, String hLastLapStr,
                                    String sMaxLapsStr, String mMaxLapsStr, String hMaxLapsStr,
                                    String raceDistStr, String pitTimeStr)
    {
        String [] arrToCheck = {sLap1Str, mLap1Str, hLap1Str, sLastLapStr, mLastLapStr, hLastLapStr, sMaxLapsStr, mMaxLapsStr, hMaxLapsStr, raceDistStr, pitTimeStr};
        
        //iterate through everey instance of the array,
        for (String str : arrToCheck)
        {
            //check whether the char in the string is a number or a period else return false
            for (int j = 0; j < str.length();j++)
            {
                char letter = str.charAt(j);
                if (! (Character.isDigit(letter) || letter == '.'))
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers into the allocated areas, using a periodt (\".\") for decimals.");
                    return false;
                } 
            }
        }
        
        return true;
    }
    public static String calcTime(long seconds)
    {
        //convert seconds into hours:minutes:seconds and return as a string
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        String time = hours +":"+ minutes +":"+ seconds;
        return time;
    }
    
    //main class used to read the information from the text file
    public static String interperetInfo()
    {
        try
        {
            Scanner info = new Scanner(infoFile).useDelimiter("#");
            info.useLocale(Locale.US);
            
            double sLap1 = info.nextDouble();
            double mLap1 = info.nextDouble();
            double hLap1 = info.nextDouble();

            double sLastLap = info.nextDouble();
            double mLastLap = info.nextDouble();
            double hLastLap = info.nextDouble();

            double sLapDeg = sLastLap/sLap1;
            double mLapDeg = mLastLap/mLap1;
            double hLapDeg = hLastLap/hLap1;

            int sMaxLaps = info.nextInt();
            int medMaxLaps = info.nextInt();
            int hMaxLaps = info.nextInt();

            int raceLaps = info.nextInt();
            double pitTime = info.nextDouble();
            info.close();
            strats = calcStrat(sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg, sMaxLaps, medMaxLaps, hMaxLaps, raceLaps, pitTime);
            return strats;
        }
        catch(FileNotFoundException e)
        {
            strats = "FileNotFoundException";
            return strats;
        }
    }
    
    //set the maximum amount of laps to be completed on the compound according to the compound instance
    public static int getMaxLaps(int compound, int sMaxLaps, int mMaxLaps, int hMaxLaps)
    {
      int maxLaps = 0;
      switch(compound)
      {
          case 0:
              maxLaps = sMaxLaps;
              break;
          case 1:
              maxLaps = mMaxLaps;
              break;
          case 2:
              maxLaps = hMaxLaps;
      }
      return maxLaps;
    }
    
    //formula used to calculate the time taken to get around a lap
    public static double getFormulatedTime(
        					int compound, int lap, 
   						double sLap1, double mLap1, double hLap1,
        					double sLapDeg, double mLapDeg, double hLapDeg
                                            )
    {
    	double formulatedTime = 0;
    	switch(compound)
        {
            case 0:
            	formulatedTime = sLap1 * ( Math.pow(sLapDeg, lap-1));
                break;
            case 1:
                formulatedTime = mLap1 * ( Math.pow(mLapDeg, lap-1));
                break;
            case 2:
            	formulatedTime = hLap1 * ( Math.pow(hLapDeg, lap-1));
        }
    	return formulatedTime;
    }
    public static String getStrats() 
    {
        strats = interperetInfo();
         
        return strats;
    }
    public static String [] getStratsAsArray()
    {
        String strategies = getStrats();
        
        Scanner stratScanner = new Scanner(strategies);
        String [] stratArr = new String[numStrats];
        for (int i = 1; i < numStrats; i++)
        {
            String line  = stratScanner.nextLine();
            stratArr[i-1] = line;
        }
        
        return stratArr;
    }
    
    //the main calculation part of the class, the calculations are made through here
    public static String calcStrat(	
                                   double sLap1, double mLap1, double hLap1,
                                    double sLapDeg, double mLapDeg, double hLapDeg,
                                    int sMaxLaps, int mMaxLaps, int hMaxLaps,
                                    double raceDist, double pitTime
                                ) 	//transform to write to text file
    {
        String [] compounds = {"soft", "medium", "hard"};
        String strategy = "";
            
    //the first stint times:
        long seconds;

        //second stint times:
        long secondTime;

        //calculate the strategy:
        String startCompound, currentStrategy = "#", secondTyre = "";
        int maxLaps, secondMax;
        int lap;
        double timeFormula, bestStrat = 0;

        for (int compound = 0; compound < 3; compound ++)//for each tyre compound
        {
            seconds = 0;
            timeFormula = 0;
            bestStrat = 0;
            startCompound = compounds[compound];

            //apply maximum laps on tyre
            maxLaps = getMaxLaps(compound, sMaxLaps, mMaxLaps, hMaxLaps);

            //stint 1:
            for (lap = 1; lap <= maxLaps; lap++)
            {

                //set formulas for first stint:
                timeFormula = getFormulatedTime(compound, lap, sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg);

                seconds += (long) timeFormula;
                secondTime = 0;
                //set second stint tyre-type
                for (int secCompound = 0; secCompound < 3; secCompound++)
                {
                    secondTyre = compounds[secCompound];
                    secondMax = getMaxLaps(secCompound, sMaxLaps, mMaxLaps, hMaxLaps);
                    int stratNr = 0;
                    //if the race can be finished on the selected tyre:
                    if (lap + secondMax >= raceDist && secCompound != compound)
                    {
                        //second stint
                        secondTime += pitTime;
                        numStrats ++;
                        for (int lapStint2 = lap+1; lapStint2 <= lap+secondMax; lapStint2++)
                        {
                            //select tyre formula for corresponding second stint tyre compound
                            timeFormula = getFormulatedTime(secCompound, lapStint2, sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg);
                            secondTime += (long) timeFormula;

                            //on last lap of race distance:
                            if (lapStint2 == raceDist)
                            {
                                break;
                            }
                        }//second stint for loop end brace

                        seconds += secondTime;
                        stratNr +=1;
                        if (stratNr == 1)
                        {
                            bestStrat = seconds;
                        }
                        strategy += "Lap1 - Lap"+ lap +": "+ startCompound +", LAP: "+ lap +", "+ secondTyre +", time:"+ calcTime(seconds) + "\n";
//                  
                    }//if the race can be finished on the selected tyre: end brace
                    seconds -= secondTime;
                    secondTime = 0;
                }//set second stint compound end brace

            }//stint one end brace

        }//first stint tyre compound end brace
        
        return strategy;
    }
}
