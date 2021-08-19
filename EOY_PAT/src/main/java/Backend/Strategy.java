/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jjaac
 */
public class Strategy
{
    private static String strats;
    public static String readArrange()
    {
        String stats = "";
        
        Scanner info = new Scanner("info.txt").useDelimiter("#");
        String soft_Info = "", medium_Info = "", hard_Info = "", raceLaps = "", pitTime = "";
        String interem;
        
        for (int i = 0; info.hasNext(); i++)
        {
            interem = info.next();
            switch (i)
            {
                case 0:case 3:case 6:
                    soft_Info += interem;
                    break;
                case 1:case 4:case 7:
                    medium_Info += interem;
                    break;
                case 2:case 5:case 8:
                    hard_Info += interem;
                    break;
                default:
                    raceLaps = interem;
                    pitTime = info.next();
            }
        }
        stats = readInfo(soft_Info, medium_Info, hard_Info);
        return stats;
    }
    
//    /*public static void main(String[] args)
//    {
//        //Read values from string
//        //String soft_Info, medium_Info, hard_Info;// = "#108.9#1.002#45";
//
////        readInfo(soft_Info, medium_Info, hard_Info);
//        //System.out.println(lap1 + ", "+ lapAvg +", tyre compound: "+ tyreCompound);
//    }*/
    public static String calcTime(long seconds)
    {
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        String time = hours +":"+ minutes +":"+ seconds;
        return time;
    }
    
    public static String readInfo(String softInfo, String mediumInfo, String hardInfo) 
    {
        String stats = "";
        
        Scanner scanS = new Scanner(softInfo).useDelimiter("#");
        scanS.useLocale(Locale.US);
        double sLap1 = scanS.nextDouble();
        double sLastLap = scanS.nextDouble();
        double sLapDeg = sLastLap/sLap1;
        int sMaxLaps = scanS.nextInt();
        //System.out.println("SOFTS: Lap1: "+ sLap1 +", lapAvg: "+ sLapDeg);
        
        //for medium tyre compound
        Scanner scanM = new Scanner(mediumInfo).useDelimiter("#");
        scanM.useLocale(Locale.US);
        double mLap1 = scanM.nextDouble();
        double mLastLap = scanM.nextDouble();
        double mLapDeg = mLastLap/mLap1;
        int medMaxLaps = scanM.nextInt();
        //System.out.println("Mediums: Lap1: "+ mLap1 +", lapAvg: "+ mLapDeg);
        
        //for hard tyre compound
        Scanner scanH = new Scanner(hardInfo).useDelimiter("#");
        scanH.useLocale(Locale.US);
        double hLap1 = Double.parseDouble(scanH.next());
        double hLastLap = Double.parseDouble(scanH.next());
        double hLapDeg = hLastLap/hLap1;
        int hMaxLaps = scanH.nextInt();
        //System.out.println("Hards: Lap1: "+ hLap1 +", lapAvg: "+ hLapDeg);
        int raceLaps = 55;
        
        stats = calcStrat(sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg, sMaxLaps, medMaxLaps, hMaxLaps, raceLaps);
        return stats;
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
        strats = readArrange();
        return strats;
    }
    public static String calcStrat(	
                                    double sLap1, double mLap1, double hLap1,
                                    double sLapDeg, double mLapDeg, double hLapDeg,
                                    int sMaxLaps, int mMaxLaps, int hMaxLaps,
                                    int raceDist
                                ) 	
    {
        String [] compounds = {"soft", "medium", "hard"};
        String strategy = "";
        
        //the first stint times:
        long seconds;
        
        //second stint times:
        long secondTime;
        
        //calculate the strategy:
        String startCompound, currentStrategy = "#", secondTyre = "";
        int maxLaps = 0, secondMax = 0;
        int lap = 1;
        double timeFormula, bestStrat = 0;
        
        for (int compound = 0; compound < 3; compound ++)//for each tyre compound
        {
            seconds = 0;
            timeFormula = 0;
            bestStrat = 0;
            startCompound = compounds[compound];
            currentStrategy += startCompound + "#";
            
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
                        if (seconds < bestStrat)
                        {
                            //System.out.println("1: "+ startCompound +", LAP: "+ lap +", 2: "+ secondTyre +", time:"+ calcTime(seconds));
                            strategy += "1: "+ startCompound +", LAP: "+ lap +", "+ secondTyre +", time:"+ calcTime(seconds) +"\n";
                        }
                    }//if the race can be finished on the selected tyre: end brace
                    seconds -= secondTime;
                    secondTime = 0;
                }//set second stint compound end brace

            }//stint one end brace
            
        }//first stint tyre compound end brace
        return strategy;
    }
}
