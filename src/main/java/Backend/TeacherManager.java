/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author janch
 */
public class TeacherManager
{
    private Teacher teacher;
    private DatabaseManager dbm = new DatabaseManager();
    private ResultSet resultSet;
    
    public double getBattingWeight(Teacher t) throws SQLException
    {
        double battingWeight = 0;
        
        getTeacher(t.getFullName());
        
        return battingWeight;
    }
    public Teacher getTeacher(String tName) throws SQLException
    {
        /*Get TimeTable*/
        String getTimeTableQuery = "Select * from `jcjDB`.`tblTimetables`"
                + "WHERE `ID` = (SELECT `ID` FROM `jcjDB`.`tblTeachers`"
                                        + " WHERE `FullName` LIKE \""+tName+"\");";
        
        resultSet = dbm.query(getTimeTableQuery);
        
        boolean [][] timeTableArr = new boolean[5][14];
       
        while (resultSet.next())
        {
            for (int i = 2; i < resultSet.getFetchSize(); i ++)
            {
                timeTableArr[resultSet.getInt(1)][i] = resultSet.getInt(i) == 1;
            }
        }
        TimeTable ttb = new TimeTable(timeTableArr);
        /*End Of Getting TimeTable*/
        
        String battingValuesQuery = "SELECT * FROM `tblTeachers`"
                                                      + "WHERE `FullName` = \""+ tName +"\";";
        resultSet = dbm.query(battingValuesQuery);
        resultSet.next();
        int numFrees = resultSet.getInt(3);
        boolean hasRegisterClass = resultSet.getInt(4) == 1;
        int extraMuralHours = resultSet.getInt(5);
        
        String numBattingsQuery = "SELECT count(*) FROM `tblBattings`"
                                + "WHERE `ID` = (SELECT `ID` FROM `tblTeachers` "
                                            + "WHERE `FullName` = \""+ tName +"\");";
        resultSet = dbm.query(numBattingsQuery);
        resultSet.next();
        int numBattings = resultSet.getInt(1);
        return new Teacher(ttb, numFrees, numBattings, extraMuralHours, tName, hasRegisterClass);
    }
    public String [] getTeacherNames() throws SQLException
    {
        String [] teacherNames;
        
        //getting the amount of rows int the table
        String getLengthQuery =  "SELECT COUNT(*) FROM `tblTeachers`;";
        resultSet = dbm.query(getLengthQuery);
        resultSet.next();
        int resultLength = resultSet.getInt(1);
        teacherNames = new String [resultLength];
        
        
        String getNamesQuery = "SELECT `FullName` FROM `tblTeachers`;";
        resultSet = dbm.query(getNamesQuery);
        
        
        int count = 0;
        while(resultSet.next())
        {
            teacherNames[count] = resultSet.getString(1);
            count++;
        }
        return teacherNames;
    }
//SELECT
    
    public TableModel getTimeTableModel(String fullName) throws SQLException
    {
        DefaultTableModel outputModel;// = new DefaultTableModel(data, columnNames);
        
        String query = "SELECT * FROM `tblTimetables`"
                     + "WHERE `ID` = (SELECT `ID` FROM `tblTeachers`"
                                    +"WHERE `FullName` = \""+ fullName +"\");";
        resultSet = dbm.query(query);
        ResultSetMetaData meta  = resultSet.getMetaData();
        
        String [][] data = new String [5][15];
        String [] cols = new String [meta.getColumnCount() - 1];
        //populate collumns
        for (int i = 0; i < cols.length; i ++)
        {
            cols[i] = meta.getColumnName(i+2);
        }
        
        //populate data array
        int curRow = 0;
        while (resultSet.next())
        {
            /*convert day number to String*/
            int dayNum = resultSet.getInt(2);
            data[curRow][0] =  dayNum == 1? "Monday": dayNum == 2? "Tuesday": dayNum == 3? "Wednesday": dayNum == 4? "Thursday": "Friday";
            for (int i = 1; i < data[curRow].length-1; i++)
            {
                data[curRow][i] = (resultSet.getInt(i+2) == 1)? "X":"";
            }
            curRow++;
        }
        
        outputModel = new DefaultTableModel(data, cols);
        return outputModel;
    }
    
    public void addTeacher(String fullName, int numFrees, boolean hasRegisterClass, int extraMuralHours, TimeTable tt) throws SQLException
    {
        //adding to tblTeachers
        insertIntoTblTeachers(fullName, numFrees, hasRegisterClass, extraMuralHours);
        
        /*adding to timetables*/        
        //get id -- part of building the query
        int id = getTeacherID(fullName);
        
        //build 2D array of timetable into query
        int [][] intbodyArr = getInsertBodyArray(id, tt);
        String queryHeader = "INSERT INTO `tblTimetables`(`ID`, `Day`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `L7`, `L8`, `L9`, `L10`, `L11`, `L12`, `L13`, `L14`)";
        String queryBody = "VALUES"+ getStringRepresentation(intbodyArr) +";";
        
        dbm.update("" + queryHeader + queryBody);
    }
    private void insertIntoTblTeachers(String fullName, int numFrees, boolean hasRegisterClass, int extraMuralHours) throws SQLException
    {
        
        String addTeacherQueryString = "INSERT INTO `jcjDB`.`tblTeachers` (`FullName`, `NumFrees`, `Register Class`, `ExtramuralHours`) \n" +
"VALUES ('"+ fullName +"', '"+ numFrees +"', '"+ ((hasRegisterClass)? 1:0) +"', '"+ extraMuralHours +"');";
        
        dbm.update(addTeacherQueryString);
    }
    private int getTeacherID(String fullName) throws SQLException
    {
        String getIDQuery = "Select `ID` FROM `jcjDB`.`tblTeachers`"
                + "WHERE `tblTeachers`.`FullName` = \""+ fullName +"\";";
        
        resultSet = dbm.query(getIDQuery);
        resultSet.next();
        return resultSet.getInt(1);
    }
    private int [][] getInsertBodyArray(int id, TimeTable tt)
    {
        int [][] outputArr = new int [5][16];
        boolean [][] tempTimeTableArray = tt.toBoolArray();
        for (int dayCount = 0; dayCount < outputArr.length; dayCount++)
        {
            outputArr[dayCount][0] = id;
            outputArr[dayCount][1] = dayCount+1;
            
            for(int j = 0; j < tempTimeTableArray[dayCount].length; j++)
            {
                //If true, output '1', else output '0'
                outputArr[dayCount][j+2] = (tempTimeTableArray[dayCount][j])? 1:0; 
            }
        }
        
        return outputArr;
    }
    public void deleteTeacher(String fullName) throws SQLException
    {
        String deleteQuery = "DELETE FROM `jcjDB`.`tblTeachers` WHERE (`FullName = \""+ fullName +"\");";
        dbm.update(deleteQuery);
    }
    public void updateTeacher(Teacher t, String originalName) throws SQLException
    {
        String updateTblTeachersQuery = "UPDATE `tblTeachers`"
                           + "SET `FullName` = \""+ t.getFullName() +"\","
                           + "`NumFrees` = "+ t.getNumFrees() +","
                           + "`RegisterClass` = "+ t.getHasRegisterClass() +","
                           + "`ExtramuralHours` = "+ t.getExtraMuralHours() +" "
                           + "WHERE `FullName` = \""+ originalName +"\";";
        dbm.update(updateTblTeachersQuery);
        
        String [] collumnNames;
        boolean [][] tempTimetable;
        
        /*Get column labels*/
        resultSet = dbm.query("SELECT * FROM `tblTimetables`;");
        ResultSetMetaData rsm = resultSet.getMetaData();
        collumnNames = new String [rsm.getColumnCount()-1];
        for (int count = 0; count < rsm.getColumnCount()-1; count++)
        {
            collumnNames[count] = rsm.getColumnLabel(count+2);
        }
        tempTimetable = t.getTimeTable().toBoolArray();
        
        //update every day's lessons for the teacher
        for (int day = 1; day <= 5; day++)
        {
            String lineUpdate = "UPDATE `jcjDB`.`tblTimetables` SET ";
            
            for (int i = 0; i < tempTimetable[day-1].length; i ++)
            {
                lineUpdate += collumnNames[i+1] +" = "+ tempTimetable[day-1][i] +(i != tempTimetable[day-1].length-1? ", ":" ");
            } 
            
            lineUpdate += " WHERE (`ID` = (SELECT `ID` FROM `jcjDB`.`tblTeachers` WHERE `tblTeachers`.`FullName` = \""+ t.getFullName() +"\")) AND (`Day` =  "+ day +") ;";
            dbm.update(lineUpdate);
        }
        
    }
    public String getUpdateTimetableString(TimeTable ttb) throws SQLException
    {
        String strRepresentation = "";
        
        String [] collumnNames;
        boolean [][] tempTimetable;
        resultSet = dbm.query("SELECT * FROM `tblTimetables`;");
        ResultSetMetaData rsm = resultSet.getMetaData();
        collumnNames = new String [rsm.getColumnCount()-2];
        
        //populate the array
        int count = 0;
        while (resultSet.next())
        {
            collumnNames[count] = resultSet.getString(count+2);
            count ++;
        }
        tempTimetable = ttb.toBoolArray();
        

        return strRepresentation;
    }
    private String getStringRepresentation(int [][] intArr)
    {
        String stringRepresentation = "";
        int count = 0;
        for (int [] arrayLvl1 : intArr)
        {
            stringRepresentation += "(";
            for (int iteratorLvl2 = 0; iteratorLvl2 < arrayLvl1.length; iteratorLvl2++)
            {
                stringRepresentation += (iteratorLvl2 != arrayLvl1.length-1)? arrayLvl1[iteratorLvl2] + ",": arrayLvl1[iteratorLvl2]; 
                //if this is the last cycle of the second level array, then don't add "," after the number^
            }
            stringRepresentation += ")" + ((count < intArr.length-1)? ",":"");
            count ++;
        }
        
        return stringRepresentation;
    }    
    public boolean isFree(int day, int lesson)
    {
//        int weekNr = 
//        return teacher.ytt.isBusy(weekNr, dayNr, lesson) ;
        return false;
    }
}
