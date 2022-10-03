/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;

import java.util.Calendar;

/**
 *
 * @author janch
 */
public class CalendarManager
{
    String [][] month;
    String [] monthNames = {"JANUARY","FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    public CalendarManager()
    {
        
    }
    public String [][] getMonthCalendar(String monthName, int year)
    {
        int numDays = getMonthLength(monthName, year);
        
        return month;
    }
    private int getMonthLength(String monthName, int year)
    {
        boolean leapyear = year%4 ==0;
        if(monthName.equalsIgnoreCase("January")) return java.time.Month.JANUARY.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.FEBRUARY.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.MARCH.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.APRIL.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.MAY.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.JUNE.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.JULY.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.AUGUST.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.SEPTEMBER.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.OCTOBER.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.NOVEMBER.length(leapyear);
        else if(monthName.equalsIgnoreCase("February")) return java.time.Month.DECEMBER.length(leapyear);
        return -1;
    }
}
