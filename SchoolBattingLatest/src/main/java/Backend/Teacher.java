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
    private int numBattings, numFrees, extraMuralHours;
    private boolean hasRegisterClass;
    private String fullName ;

    public Teacher(TimeTable timeTable, int numFrees, int numBattings, int extraMuralHours, String fullName, boolean hasRegisterClass)
    {
        this.timeTable = timeTable;
        this.numFrees = numFrees;
        this.numBattings = numBattings;
        this.extraMuralHours = extraMuralHours;
        this.hasRegisterClass = hasRegisterClass;
        this.fullName = fullName;
    }
    public double getBattingWeight()
    {
        return (numFrees * 0.3 + numBattings * 0.3 + extraMuralHours * 0.3 + (hasRegisterClass? 1: 0 * 0.1)) ;
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
