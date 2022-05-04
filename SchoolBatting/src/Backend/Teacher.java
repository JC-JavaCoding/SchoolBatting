/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author janch
 */
public class Teacher
{
    public  boolean [][] timeTable;
    public int numBattings = 0;
    public String fullName = "";
    
    public String toString()
    {
        String summary = fullName + "#" + numBattings + "#";
        
        //for each day in the timetable
        for (boolean [] day : timeTable)
        {
            //for each lesson in the day
            for (boolean lesson: day)
            {
                summary +=  lesson +"#";
            }
            //indicate new day:
            summary =summary.substring(0, summary.lastIndexOf("#")) + "%";
        }
        
        return summary;
    }
}
