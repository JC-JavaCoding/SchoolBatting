/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author janch
 */
public class BattingLesson
{
    int lesson;
    private LocalDate battingDay;
    private String fullName;
    public BattingLesson(String fullName, int lesson, int dayOfMonth, int month, int year)
    {
        battingDay = LocalDate.of(year, month, dayOfMonth);
        this.lesson = lesson;
        this.fullName = fullName;
    }
        
    public int getMonth()
    {
        return battingDay.getMonthValue();
    }

    public int getLesson()
    {
        return lesson;
    }

    public void setLesson(int lesson)
    {
        this.lesson = lesson;
    }

    public void setBattingDay(int dayOfMonth)
    {
        this.battingDay = LocalDate.of(battingDay.getYear(), battingDay.getMonth(), dayOfMonth);
    }
    public void setBattingMonth(int month)
    {
        this.battingDay = LocalDate.of(battingDay.getYear(), month, battingDay.getDayOfMonth());
    }
    public void setBattingYear(int year)
    {
        this.battingDay = LocalDate.of(year, battingDay.getMonth(), battingDay.getDayOfMonth());
    }

    public LocalDate getLocalDate()
    {
        return battingDay;
    }
    
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public int getDayOfMonth()
    {
        return battingDay.getDayOfMonth();
    }    
    public String getFullName()
    {
        return fullName;
    }
    
    public int getYear()
    {
        return battingDay.getYear();
    }
}
