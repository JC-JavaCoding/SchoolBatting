/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;

import Backend.TeacherManager;
import Backend.TimeTable;
import Backend.BattingLesson;
import SQL.DatabaseManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author janch
 */
public class TimeTableTesting
{
    private static boolean [][] tt;
    public static void main(String[] args) throws SQLException
    {
        DatabaseManager db = new DatabaseManager();
        
        ResultSet rs = db.query( "SELECT * FROM timetable"
                + " WHERE teacherID = 1;" );

        boolean b = false;
        boolean [][] arr = new boolean[5][14];
        int day = 0;
        while(rs.next())
        {
            for(int i = 0; i <14; i++)
            {
                arr[day][i] = rs.getBoolean(i+3);
            }
            day++;
        }
        
        TimeTable ttA = new TimeTable(arr);
        TeacherManager tm = new TeacherManager();
        System.out.println(ttA.toString());
        
        BattingLesson yttA = new BattingLesson(ttA);
        
        
    }
}
