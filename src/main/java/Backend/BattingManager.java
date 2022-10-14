/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author janch
 */
public class BattingManager
{
    private TeacherManager tm;
    private DatabaseManager dbm;
    public BattingManager()
    {
        tm = new TeacherManager();
        dbm = new DatabaseManager();
    }
    public String [] getBattingsArray(int month) throws SQLException
    {
        TableModel model;// = new DefaultTableModel();
        String [][] data = new String[5][15];
        String getBattingsQuery = "SELECT * FROM `tblBattings`  WHERE `Month` = "+ month +" ORDER BY `Week` ASC, `DayOfWeek` ASC, `Lesson` ASC;";
        ResultSet rs = dbm.query(getBattingsQuery);
        
        int weekCount = 0;
        while(rs.next())
        {
            data[weekCount][0] = "" + (weekCount *7 +1);
            for(int day = 0; day < data[weekCount].length; day ++)
            {
                
            }
            weekCount ++;
        }
        
        return null;
    }
    public ArrayList<Teacher> getBattingTeachers(int lesson, int day, int dayOfMonth, int month) throws SQLException
    {
        //variable declaration
        ArrayList viableTeachers =  new ArrayList<Teacher>();
        String[] teacherNames;
        Teacher t;
                
        //get teacher names
        teacherNames = tm.getTeacherNames();
        
        //getViable teachers
        for (String name : teacherNames)
        {
            t = tm.getTeacher(name);
            if (tm.isFree(t, lesson, day, dayOfMonth, month))
            {
                viableTeachers.add(t);
            }
        }
        //sort and shorten to length of three:
        
        return formatTeachersArrayList(viableTeachers);
    }
    private ArrayList<Teacher> formatTeachersArrayList(ArrayList <Teacher> teachers)
    {
        ArrayList<Teacher> sortedArrayList = new ArrayList<>();
        for (int i = teachers.size()-1; i < teachers.size(); i++)
        {
            for(int j = 0; j < i; j++)
            {
                if( teachers.get(j).getBattingWeight() < teachers.get(j+1).getBattingWeight()) 
                {
                    Teacher temp = teachers.get(j);
                    teachers.set(j, teachers.get(j+1));
                    teachers.set(j+1, temp);
                }
            }
        }
        
        //safety
        if(teachers.size() > 3) 
        {
            sortedArrayList.add(teachers.get(0));
            sortedArrayList.add(teachers.get(1));
            sortedArrayList.add(teachers.get(2));
        }else {
            for (Teacher t : teachers)
            {
                sortedArrayList.add(t);
            }
        }
        return sortedArrayList;
    }
    
    public void addBatting(BattingLesson bl) throws SQLException
    {
        String addBattingQuery = "Insert Into `tblBattings`(`ID`, `Lesson`, `DayofWeek`, `Week`, `Month`) VALUES ";
        
        //get ID
        ResultSet rs = dbm.query("SELECT `ID` FROM `tblTeachers` WHERE `FullName` = \""+ bl.getFullName() +"\";");
        rs.next();
        String id = rs.getString(1);
        
        //insert into tblBattings
        addBattingQuery += "("+ id +","+ bl.getLesson() +","+ bl.getDayOfWeek() +","+ bl.getWeek() +","+ bl.getMonth() +");";
        
        dbm.update(addBattingQuery);
    }
}
