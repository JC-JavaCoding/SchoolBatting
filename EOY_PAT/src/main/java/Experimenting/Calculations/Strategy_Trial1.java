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
    public void main(String[] args)
    {
        //Read values from string
        String soft_Info, medium_Info, hard_Info;// = "#108.9#1.002#45";
        
        readInfo(soft_Info, medium_Info, hard_Info);
        //System.out.println(lap1 + ", "+ lapAvg +", tyre compound: "+ tyreCompound);
    }
    public String calcTime(long seconds)
    {
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        String time = hours +":"+ minutes +":"+ seconds;
        return time;
    }
    
    public void readInfo(String softInfo, String mediumInfo, String hardInfo) 
    {
    	Scanner scanS = new Scanner(softInfo).useDelimiter("#");
        scanS.useLocale(Locale.US);
        double sLap1 = scanS.nextDouble();
        double sLapDeg = scanS.nextDouble();
        int sMaxLaps = scanS.nextInt();
        double sFormula;
        System.out.println("SOFTS: Lap1: "+ sLap1 +", lapAvg: "+ sLapDeg);
        
        //for medium tyre compound
        Scanner scanM = new Scanner(mediumInfo).useDelimiter("#");
        scanM.useLocale(Locale.US);
        double mLap1 = scanM.nextDouble();
        double mLapDeg = scanM.nextDouble();
        int medMaxLaps = scanM.nextInt();
        double mFormula;
        System.out.println("Mediums: Lap1: "+ mLap1 +", lapAvg: "+ mLapDeg);
        
        //for hard tyre compound
        Scanner scanH = new Scanner(hardInfo).useDelimiter("#");
        scanH.useLocale(Locale.US);
        double hLap1 = scanH.nextDouble();
        double hLapDeg = scanH.nextDouble();
        int hMaxLaps = scanH.nextInt();
        double hFormula;
        System.out.println("Hards: Lap1: "+ hLap1 +", lapAvg: "+ hLapDeg);
        
        calcStrat(sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg, sMaxLaps, medMaxLaps, hMaxLaps);
    }
    
    public int getMaxLaps(int compound, int sMaxLaps, int mMaxLaps, int hMaxLaps)
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
    
    public double getFormulatedTime(
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
    
    public void calcStrat(	
    								double sLap1, double mLap1, double hLap1,
    								double sLapDeg, double mLapDeg, double hLapDeg,
    								int sMaxLaps, int mMaxLaps, int hMaxLaps
    							) 	
    {
        String [] compounds = {"soft", "medium", "hard"};
        String bestStrategy = "";
        
        //the first stint times:
        long seconds;
        
        //second stint times:
        long secondTime;
        
        //calculate the strategy:
        String startCompound, currentStrategy = "#", secondTyre = "";
        int maxLaps = 0, secondMax = 0;
        int raceDistance = 54, lap = 1;
        double timeFormula;
        
        for (int compound = 0; compound < 3; compound ++)//for each tyre compound
        {
            seconds = 0;
            timeFormula = 0;
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
                    
                    //if the race can be finished on the selected tyre:
                    if (lap + secondMax >= raceDistance && secCompound != compound)
                    {
                        //second stint
                        for (int lapStint2 = lap+1; lapStint2 <= lap+secondMax; lapStint2++)
                        {
                            //select tyre formula for corresponding second stint tyre compound
                            timeFormula = getFormulatedTime(secCompound, lapStint2, sLap1, mLap1, hLap1, sLapDeg, mLapDeg, hLapDeg);
                            secondTime += (long) timeFormula;

                            //on last lap of race distance:
                            if (lapStint2 == raceDistance)
                            {
                                break;
                            }
                        
                        }//second stint for loop end brace
                        
                        seconds += secondTime;
                        System.out.println("1: "+ startCompound +", LAP: "+ lap +", 2: "+ secondTyre +", time:"+ calcTime(seconds));
                    
                    }//if the race can be finished on the selected tyre: end brace
                    
                    seconds -= secondTime;
                    secondTime = 0;
                }//set second stint compound end brace

            }//stint one end brace
            
        }//first stint tyre compound end brace
    }
}
