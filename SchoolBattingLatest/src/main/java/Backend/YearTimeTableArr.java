/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;

/**
 *
 * @author janch
 */
public class YearTimeTableArr
{
    boolean [][][] yearTT = new boolean[52][5][14];
    public YearTimeTableArr(TimeTable tt)
    {
        for (boolean[][] t : yearTT)
        {
            t = tt.getTimeTable();
        }
    }
    public boolean isBusy(int dayNr, int lessonNr)
    {
        return yearTT[getWeekNr() - 1][dayNr][lessonNr];
    }
    public boolean isBusy(int weekNr, int dayNr, int lessonNr)
    {
        return yearTT[weekNr][dayNr][lessonNr];
    }
        
    private int getWeekNr()
    {
        LocalDate date = LocalDate.now();
        return date.getDayOfYear()/7;
    }
}
