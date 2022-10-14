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
public class BattingLesson
{
    private int lesson, dayOfWeek, week, month;
    private String fullName;
    public BattingLesson(String fullName, int lesson, int dayOfWeek, int week, int month)
    {
        this.month = month;
        this.fullName = fullName;
        this.week = week;
        this.dayOfWeek = dayOfWeek;
        this.lesson = lesson;
    }
        
    public int getMonth()
    {
        return month;
    }

    public int getLesson()
    {
        return lesson;
    }

    public int getDayOfWeek()
    {
        return dayOfWeek;
    }    
    public String getFullName()
    {
        return fullName;
    }
    
    public int getWeek()
    {
        return week;
    }
}
