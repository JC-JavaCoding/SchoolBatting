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

/**
 *
 * @author jjaac
 */
public class Strategy
{
//    public static void main(String[] args)
//    {
//        getStratsAsArray();
//    }
    
    public static String strats;
    private static int numStrats = 0;
    public static String calcTime(long seconds)
    {
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        String time = hours +":"+ minutes +":"+ seconds;
        return time;
    }
    public static String interperetInfo()
    {
        try
        {
            Scanner info = new Scanner(new File("data\\info.txt")).useDelimiter("#");
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
            info.close();
            strats = calcStrat(sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg, sMaxLaps, medMaxLaps, hMaxLaps, raceLaps);
            return strats;
        }
        catch(FileNotFoundException e)
        {
            strats = "FileNotFoundException";
            return strats;
        }
    }
    
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
        PrintWriter outputFile = null;
        try 
        {
            strats = interperetInfo();
            outputFile = new PrintWriter("data/output.txt");
//            String output = Strategy.getStrats();
            outputFile.print(strats);
            outputFile.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        } 
        return strats;
    }
    public static String [] getStratsAsArray()
    {
        
        System.out.println("Entered getStratsAsArray method.");
        String strategies = getStrats();
        System.out.println("Entered getStratsAsArray method.");
        System.out.println("Strategies: \n"+ strategies);
        
        //find out how many strategies there are for the array to be set to that number.
        Scanner numLinesScanner = new Scanner(strategies).useDelimiter("\n");
        int nrLines = 0;
       while (numLinesScanner.hasNextLine() ) 
        {
            System.out.println("Nr Lines: "+ nrLines);
            numLinesScanner.nextLine(); 
        }
        
        Scanner stratScanner = new Scanner(strategies);
        String [] stratArr = new String[numStrats];
        for (int i = 1; i < numStrats; i++)
        {
            String line  = stratScanner.nextLine();
            System.out.println( "Line: "+ i +", "+  line  );
            stratArr[i-1] = line;
        }
        System.out.println("End of getStratsAsArray method");
        return stratArr;
    }
    public static String calcStrat(	
                                    double sLap1, double mLap1, double hLap1,
                                    double sLapDeg, double mLapDeg, double hLapDeg,
                                    int sMaxLaps, int mMaxLaps, int hMaxLaps,
                                    int raceDist
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
//            currentStrategy += startCompound + "#";
            
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
//                        if (seconds < bestStrat)
//                        {
//                            System.out.println("1: "+ startCompound +", LAP: "+ lap +", 2: "+ secondTyre +", time:"+ calcTime(seconds));
                            strategy += numStrats + ": "+ startCompound +", LAP: "+ lap +", "+ secondTyre +", time:"+ calcTime(seconds) + "\n";
//                        }
                    }//if the race can be finished on the selected tyre: end brace
                    seconds -= secondTime;
                    secondTime = 0;
                }//set second stint compound end brace

            }//stint one end brace
            
        }//first stint tyre compound end brace
        return strategy;
    }
}
