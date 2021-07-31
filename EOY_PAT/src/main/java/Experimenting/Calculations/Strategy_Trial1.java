/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.Calculations;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jcj
 */
public class Strategy_Trial1
{
    public static void main(String[] args)
    {
        //Read values from string
        String soft_Info = "#107.9#1.005", medium_Info = "#108.5#1.003", hard_Info = "#108.9#1.002";
        
        String strategy = bestStrat(soft_Info, medium_Info, hard_Info);
        //System.out.println(lap1 + ", "+ lapAvg +", tyre compound: "+ tyreCompound);
    }
    public static String calcTime(long seconds)
    {
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        String time = hours +":"+ minutes +":"+ seconds;
        return time;
    }
    public static String bestStrat(String softInfo, String mediumInfo, String hardInfo)
    {
        String [] compounds = {"soft", "medium", "hard"};
        String bestStrategy = "";
        
        //the first stint times:
        long seconds;
        
        //second stint times:
        long secondTime;
        
        //for soft tyre compound
        Scanner scanS = new Scanner(softInfo).useDelimiter("#");
        scanS.useLocale(Locale.US);
        double sLap1 = scanS.nextDouble();
        double sLapAvg = scanS.nextDouble();
        double sFormula;
        int sMaxLaps = 15;
        System.out.println("SOFTS: Lap1: "+ sLap1 +", lapAvg: "+ sLapAvg);
        
        //for medium tyre compound
        Scanner scanM = new Scanner(mediumInfo).useDelimiter("#");
        scanM.useLocale(Locale.US);
        double mLap1 = scanM.nextDouble();
        double mLapAvg = scanM.nextDouble();
        double mFormula;
        int medMaxLaps = 30;
        System.out.println("Mediums: Lap1: "+ mLap1 +", lapAvg: "+ mLapAvg);
        
        //for hard tyre compound
        Scanner scanH = new Scanner(hardInfo).useDelimiter("#");
        scanH.useLocale(Locale.US);
        double hLap1 = scanH.nextDouble();
        double hLapAvg = scanH.nextDouble();
        double hFormula;
        int hMaxLaps = 40;
        System.out.println("Hards: Lap1: "+ hLap1 +", lapAvg: "+ hLapAvg);
        
//calculate the strategy:
        String startCompound, currentStrategy = "#";
        int maxLaps = 0, secondMax = 0;
        String secondTyre = "";
        int raceDistance = 54;
        int lap = 1;
        double timeFormula;
        
        for (int compound = 0; compound < 3; compound ++)//for each tyre compound
        {
            seconds = 0;
            timeFormula = 0;
            startCompound = compounds[compound];
            currentStrategy += startCompound + "#";
            
            //apply maximum laps on tyre
            switch(compound)
            {
                case 0:
                    maxLaps = sMaxLaps;
                    break;
                case 1:
                    maxLaps = medMaxLaps;
                    break;
                case 2:
                    maxLaps = hMaxLaps;
            }
            
            //stint 1:
            for (lap = 1; lap <= maxLaps; lap++)
            {
                
                //set formulas for first stint:
                switch(compound)
                {
                    case 0:
                        timeFormula = sLap1 * ( Math.pow(sLapAvg, lap-1));
                        break;
                    case 1:
                        timeFormula = mLap1 * ( Math.pow(mLapAvg, lap-1));
                        break;
                    case 2:
                        timeFormula = hLap1 * ( Math.pow(hLapAvg, lap-1));
                }
                
                seconds += (long) timeFormula;
                secondTime = 0;
                //System.out.println("1st stint: seconds(main) value: "+ seconds);
                //System.out.println(startCompound +", lap: "+ lap +", time: "+ calcTime(seconds));
                //set second stint tyre-type
                for (int secCompound = 0; secCompound < 3; secCompound++)
                {
                    
                    secondTyre = compounds[secCompound];
                    switch(secCompound)
                    {
                        case 0:
                            secondMax = sMaxLaps;
                            break;
                        case 1:
                            secondMax = medMaxLaps;
                            break;
                        case 2:
                            secondMax = hMaxLaps;
                    }
                    //if the race can be finished on the selected tyre:
                    if (lap + secondMax >= raceDistance && secCompound != compound)
                    {
                        //second stint
                        for (int lapStint2 = lap+1; lapStint2 <= lap+secondMax; lapStint2++)
                        {
                            //select tyre formula for corresponding second stint tyre compound
                            switch(secCompound)
                            {
                                case 0:
                                    timeFormula = sLap1 * ( Math.pow(sLapAvg, lapStint2-1));
                                    break;
                                case 1:
                                    timeFormula = mLap1 * ( Math.pow(mLapAvg, lapStint2-1));
                                    break;
                                case 2:
                                    timeFormula = hLap1 * ( Math.pow(hLapAvg, lapStint2-1));
                            }
                            
                            secondTime += (long) timeFormula;
                            
                            //System.out.println("2nd stint: TimeFormula value: "+ timeFormula +", secondTime value: "+ secondTime +", Seconds(main): "+ seconds);
                            //on last lap of race distance:
                            if (lapStint2 == raceDistance)
                            {
                                //System.out.println("second stint: "+ secondTyre +", lap: "+ lapStint2 +", time:"+ calcTime(seconds));
                                break;
                            }
                        }
                        seconds += secondTime;
                        System.out.println("1: "+ startCompound +", 2: "+ secondTyre +", time:"+ calcTime(seconds));
                    }
                    
                    seconds -= secondTime;
                    secondTime = 0;
                }
                seconds -= secondTime;
                secondTime = 0;
            }
        }
        
        return bestStrategy;
    }
}
