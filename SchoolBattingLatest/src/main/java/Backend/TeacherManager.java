/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author janch
 */
public class TeacherManager
{
    private Teacher teacher;
    private DatabaseManager db = new DatabaseManager();
    private static File f = new File("data/teachers.txt");
    
    public double getBattingWeight(Teacher t)
    {
        double battingWeight = 0;
        
        db.
        
        return battingWeight;
    }
    public boolean isFree(int day, int lesson)
    {
//        int weekNr = 
//        return teacher.ytt.isBusy(weekNr, dayNr, lesson) ;
        return false;
    }
//    public void addTeacher(String name, boolean [][] timeTable,int count) throws SQLException
//    {
//        
//        DatabaseManager db = new DatabaseManager();
//        
//        ResultSet rs = db.query("SELECT * FROM timetable;");
//        
//        boolean [][] arr = new boolean[5][14];
//        int day = 0;
//        while(rs.next()){
//            for(int i = 0; i <14; i++){
//                arr[day][i] = rs.getBoolean(i + 3);
//            }
//            day++;
//        }
//        
//        TimeTable ttA = new TimeTable(arr);
//        
//        YearTimeTableArr yttA = new YearTimeTableArr(ttA);
//        
//        
//        TimeTable ttb = new TimeTable(timeTable);
//        YearTimeTableArr yttb = new YearTimeTableArr(ttb);
//        
//        teacher = new Teacher(ttb, yttb, count, name);
//        try
//        {
//            FileWriter fw = new FileWriter(f, true);
//            fw.append(teacher.toString() +"\n");
//            fw.close();
//        }catch(java.io.IOException e)
//        {
//            System.out.println("file not found");
//        }
//    }
}
