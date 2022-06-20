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
    private final TimeTable timeTable;
    public YearTimeTableArr ytt;
    public int numBattings ;
    public String fullName ;

    public Teacher(TimeTable timeTable, YearTimeTableArr yTT, int numBattings, String fullName)
    {
        this.timeTable = timeTable;
        this.ytt =  yTT;
        this.numBattings = numBattings;
        this.fullName = fullName;
    }
    
    
    @Override
    public String toString()
    {
        String summary = fullName + "#" + numBattings + "#";
        
        //for each day in the timetable
        for (boolean [] day : timeTable.getTimeTable())
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
