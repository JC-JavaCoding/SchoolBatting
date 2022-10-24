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
    private TimeTable timeTable;

    public void setTimeTable(TimeTable timeTable) 
    {
        this.timeTable = timeTable;
    }
    private int numBattings, numFrees, extraMuralHours;
    private boolean hasRegisterClass;
    private String fullName ;

    public Teacher(TimeTable timeTable, int numBattings, int extraMuralHours, String fullName, boolean hasRegisterClass)
    {
        this.timeTable = timeTable;
        this.numBattings = numBattings;
        this.extraMuralHours = extraMuralHours;
        this.hasRegisterClass = hasRegisterClass;
        this.fullName = fullName;
    }
    public double getBattingWeight()
    {
        return (numFrees * 0.3 + numBattings * 0.5 + extraMuralHours * 0.3 + (hasRegisterClass? 1: 0 )*0.1 ) ;
    }
    @Override
    public String toString()
    {
        String summary = fullName + "#" + numBattings + "#";
        
        //for each day in the timetable
        for (boolean [] day : timeTable.toBoolArray())
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

    public boolean isFree(int lesson, int dayOfWeek)
    {
        if( dayOfWeek <= 5) return !timeTable.toBoolArray()[dayOfWeek-1][lesson-1];
        else return true;
    }
    
    public TimeTable getTimeTable() {
        return timeTable;
    }

    public int getNumBattings() {
        return numBattings;
    }

    public int getNumFrees()    {
        int count =0;
        for (boolean [] bArr : timeTable.toBoolArray())
        {
            for (boolean b : bArr)
            {
                count += (!b)? 1:0;
            }
        }
        return count;
    }

    public int getExtraMuralHours() {
        return extraMuralHours;
    }

    public boolean getHasRegisterClass() {
        return hasRegisterClass;
    }

    public void setNumBattings(int numBattings) {
        this.numBattings = numBattings;
    }

    public void setNumFrees(int numFrees) {
        this.numFrees = numFrees;
    }

    public void setExtraMuralHours(int extraMuralHours) {
        this.extraMuralHours = extraMuralHours;
    }

    public void setHasRegisterClass(boolean hasRegisterClass) {
        this.hasRegisterClass = hasRegisterClass;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
