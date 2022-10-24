/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author janch
 */
public class BattingManager
{
private DatabaseManager dbm;

    public BattingManager()
    {
        dbm = new DatabaseManager();
    }

    public ArrayList<BattingLesson> getMonthBattings(int month) throws SQLException
    {
        ArrayList<BattingLesson> dates = new ArrayList<>();
        int year = LocalDate.now().getYear();

//        String [][] data = new String[5][15];
        String getBattingsQuery = "SELECT (SELECT `FullName` FROM `tblTeachers` WHERE `ID` = `tblBattings`.`ID`) AS `FullName`, `Lesson`, `DayofMonth`, `Month`, `Year`"
                + " FROM `tblBattings` "
                + " WHERE `Month` = " + month + " "
                + "ORDER BY `Year` ASC,  `Month` ASC, `DayOfMonth` ASC, `Lesson` ASC;";
        ResultSet rs = dbm.query(getBattingsQuery);

        while (rs.next())
        {
            if (rs.getInt("Year") == year)
            {
                dates.add(new BattingLesson(rs.getString(1), rs.getInt("Lesson"), rs.getInt("DayofMonth"), rs.getInt("Month"), year));
            }
        }
        return dates;
    }

    public TableModel getMonthBattingModel(JTable jtbl, Month m, String[][] baseTableData) throws SQLException
    {

        DefaultTableModel dm = new DefaultTableModel()
        {
            public Class getColumnClass(int columnIndex)
            {
                return String.class;
            }
        };

        String[][] data = baseTableData;

        ArrayList<BattingLesson> battingDates = getMonthBattings(m.getValue());
        if (!battingDates.isEmpty())
        {
            for (int week = 0; week < data.length; week++)
            {
                for (int day = 0; day < data[week].length; day++)
                {
                    String dayLessons = data[week][day];
                    //cycle through all of the battingDates:
                    for (BattingLesson bl : battingDates)
                    {
                        //if the number in the cell corresponds with that of a battingLesson's day of month, then add it to the string []
                        if (data[week][day] != null && data[week][day].equals(String.valueOf(bl.getDayOfMonth())))
                        {
                            dayLessons += "\nL" + bl.getLesson() + ": " + getInitials(bl.getFullName());
                        }
                    }
                    data[week][day] = dayLessons;
                }
            }
        }

        String[] colNames =
        {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        dm.setDataVector(data, colNames);
        return dm;
    }
    
    private String getInitials(String name)
    {
        String initials = "";
        Scanner namesc = new Scanner(name);

        while (namesc.hasNext())
        {
            initials += namesc.next().charAt(0) + ".";
        }
        return initials;
    }

    public ArrayList<Teacher> getBattingTeachers(int lesson, int dayOfWeek, int dayOfMonth, int month, int year) throws SQLException
    {
        TeacherManager tm = new TeacherManager();
        //variable declaration
        ArrayList viableTeachers = new ArrayList<Teacher>();
        String[] teacherNames;
        Teacher t;
        BattingLesson bl;

        //get teacher names
        teacherNames = tm.getTeacherNames();

        //getViable teachers
        for (String name : teacherNames)
        {
            t = tm.getTeacher(name);
            bl = new BattingLesson(name, lesson, dayOfMonth, month, year);
            boolean isFree = !teacherHasBatting(bl) && t.isFree(lesson, dayOfWeek);//hasFreeLesson && !hasBatting;
            if (isFree)//
            {
                viableTeachers.add(t);
            }
        }
        //sort and shorten to length of three:

        return formatTeachersArrayList(viableTeachers);
    }

    private ArrayList<Teacher> formatTeachersArrayList(ArrayList<Teacher> teachers)
    {
        ArrayList<Teacher> sortedArrayList = new ArrayList<>();
        for (int i = teachers.size() - 1; i < teachers.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (teachers.get(j).getBattingWeight() > teachers.get(j + 1).getBattingWeight())
                {
                    Teacher temp = teachers.get(j);
                    teachers.set(j, teachers.get(j + 1));
                    teachers.set(j + 1, temp);
                }
            }
        }

        //safety
        if (teachers.size() > 3)
        {
            sortedArrayList.add(teachers.get(0));
            sortedArrayList.add(teachers.get(1));
            sortedArrayList.add(teachers.get(2));
        } else
        {
            for (Teacher t : teachers)
            {
                sortedArrayList.add(t);
            }
        }
        return sortedArrayList;
    }
    
    public boolean teacherHasBatting(BattingLesson bl) throws SQLException
    {
        TeacherManager tm = new TeacherManager();
        int teacherID;
        String getBattingsQuery;

        //see wether the teacher has a batting scheduled for the time
        teacherID = tm.getTeacherID(bl.getFullName());

        //from database:  get battings for teacher
        getBattingsQuery = "SELECT * FROM `tblBattings` WHERE `ID` = "+ teacherID +"";
        ResultSet resultSet = dbm.query(getBattingsQuery);

        //
        while(resultSet.next())
        {
            boolean  hasBatting = resultSet.getInt(2) == bl.getLesson() && resultSet.getInt(3) == bl.getDayOfMonth() && resultSet.getInt(4) == bl.getMonth() && resultSet.getInt(5) == bl.getYear();
             if (hasBatting )return true;
        }
        return false;
    }
    public void addBatting(BattingLesson bl) throws SQLException
    {
        if(!teacherHasBatting(bl))
        {

            //get ID
            ResultSet rs = dbm.query("SELECT `ID` FROM `tblTeachers` WHERE `FullName` = \"" + bl.getFullName() + "\";");
            rs.next();
            String id = rs.getString(1);

            //insert into tblBattings
            String addBattingQuery = "Insert Into `tblBattings`(`ID`, `Lesson`, `DayofMonth`, `Month`, `Year`) VALUES ";
            addBattingQuery += "(" + id + ", " + bl.getLesson() + ", " + bl.getDayOfMonth() + ", " + bl.getMonth() + ", " + bl.getYear() + ");";

            dbm.update(addBattingQuery);
        }
        else JOptionPane.showMessageDialog(null, "This lesson is already occupied by this teacher.");
    }
    public ArrayList<BattingLesson> getBattingForDay(int dayOfMonth, int month) throws SQLException
    {
        ArrayList battingLessons = new ArrayList<BattingLesson>();
        String getBattingsQuery = "SELECT * FROM `tblBattings` WHERE `DayofMonth` = "+ dayOfMonth +" AND `Month` = "+ month +";";
        ResultSet rs = dbm.query(getBattingsQuery);
        
        while(rs.next())
        {
           ResultSet nameRS = dbm.query("Select `FullName` FROM `tblTeachers` WHERE `ID` = "+rs.getInt(1));
            nameRS.next();
            String fullName = nameRS.getString(1);
            battingLessons.add(
                    new BattingLesson(fullName, rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5))
            );
        }
        
        return battingLessons;
    }
    
    public void deleteBatting(BattingLesson bl) throws SQLException
    {
        String deleteQuery = "DELETE FROM `jcjDB`.`tblBattings` WHERE `ID` = (SELECT `ID` FROM `tblTeachers` WHERE `FullName` = \""+ bl.getFullName() +"\") "
                + "AND (`Lesson` =" + bl.getLesson() + " AND `DayofMonth` = " + bl.getDayOfMonth() + " AND `Month` = " + bl.getMonth() + " AND `Year` = " + bl.getYear() + ");";
        dbm.update(deleteQuery);
        
    }
}
