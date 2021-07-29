/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.Calculations;

import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class Strategy_Trial1
{
    public static void main(String[] args)
    {
        //Read values from string
        String soft_Info = "#107.9#107.5", medium_Info = "#107.9#107.5", hard_Info = "#107.9#107.5";
        
        String strategy = bestStrat(soft_Info, medium_Info, hard_Info);
        //System.out.println(lap1 + ", "+ lapAvg +", tyre compound: "+ tyreCompound);
    }
    
    public static String bestStrat(String softInfo, String mediumInfo, String hardInfo)
    {
        String [] compounds = {"soft", "medium", "hard"};
        String bestStrategy = "";
        
        //for soft tyre compound
        Scanner scanS = new Scanner(softInfo).useDelimiter("#");
        double sLap1 = scanS.nextDouble();
        double sLapAvg = scanS.nextDouble();
        double sFormula;
        int sMaxLaps = 15;
        
        //for medium tyre compound
        Scanner scanM = new Scanner(mediumInfo).useDelimiter("#");
        double mLap1 = scanM.nextDouble();
        double mLapAvg = scanM.nextDouble();
        double mFormula;
        int medMaxLaps = 30;
        
        //for hard tyre compound
        Scanner scanH = new Scanner(hardInfo).useDelimiter("#");
        double hLap1 = scanH.nextDouble();
        double hLapAvg = scanH.nextDouble();
        double hFormula;
        int hMaxLaps = 40;
        
        //calculate the strategy:
        String startCompound, currentStrategy = "#";
        int maxLaps = 0;
        String secondTyre = "";
        for (int compound = 0; compound < 3; compound ++)//for each tyre compound
        {
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
            for (int lap = 1; lap <= maxLaps; lap++)// 15 has been used s the default maximum laps in the tyre.
            {
                System.out.println(startCompound +", lap: "+ lap);
                
                //set second stint tyre-type
                for (int secCompound = 0; secCompound < 2; secCompound++)
                {
                    secondTyre = compounds[secCompound];
                    if (secCompound != compound)
                    {
                        for (int lapStint2 = maxLaps; lapStint2 < maxLaps+30; lapStint2++)
                        {
                            System.out.println("second stint: "+ secondTyre +", lap: "+ lapStint2);
                        }
                    }
                }
            }
        }
        
        return bestStrategy;
    }
}
