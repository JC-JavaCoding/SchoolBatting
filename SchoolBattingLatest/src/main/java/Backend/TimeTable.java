/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author janch
 */
public class TimeTable
{
    private boolean [][] timeTable;
    public TimeTable(boolean [][] tt)
    {
        timeTable = tt;
    }
    public boolean[][] getTimeTable()
    {
        return timeTable;
    }
    
    public String toString()
    {
        String output = "[";
        for (boolean[] b: timeTable)
        {
            for (boolean bb: b)
            {
                output += Boolean.toString(bb)+ ",";
            }
            output += "\n";
        }
        output += "]";
        
        return output;
    }
}
