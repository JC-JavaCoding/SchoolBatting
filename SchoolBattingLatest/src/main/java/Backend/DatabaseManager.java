/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cliftonb
 */
public class DatabaseManager
{

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://102.130.115.69:3306/jcjDB";
    private static final String user = "jcj";
    private static final String pass = "Reddam2021";
    
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Connection conn;

    public DatabaseManager()
    {
        /**
         * Note: the following was added to the pom.xml:
         * <dependencies>
         * <dependency>
         * <groupId>mysql</groupId>
         * <artifactId>mysql-connector-java</artifactId>
         * <version>8.0.25</version>
         * </dependency>
         * </dependencies>
         */
        try
        {
            Class.forName(driver);
            System.out.println("DB: Driver found");
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB: Unable to load driver");
        }

        try
        {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("DB: Database connected");
        } catch (Exception e)
        {
            System.out.println("DB: Unable to load database");
        }
    }

    //INSERT, UPDATE or DELETE
    public void update(String update) throws SQLException
    {
        statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }
    public Teacher getTeacher(String tName) throws SQLException
    {
        /*Get TimeTable*/
        String getTimeTable = "Select * from `jcjDB`.`tblTimeTables`"
                + "WHERE `ID` = (SELECT `ID` FROM `jcjDB`.`tblTeachers`"
                                        + " WHERE `Name` LIKE \""+tName+"\");";
        statement = conn.prepareStatement(getTimeTable);
        resultSet = statement.executeQuery();
        
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
                                                      + "WHERE `Name` = \""+ tName +"\";";
        resultSet = conn.prepareStatement(battingValuesQuery).executeQuery();
        int numFrees = resultSet.getInt(3);
        boolean hasRegisterClass = resultSet.getInt(4) == 1;
        int extraMuralHours = resultSet.getInt(5);
        
        String numBattingsQuery = "SELECT count(*) FROM `tblBattings`"
                                                    + "WHERE `Name` = \""+ tName +"\";";
        int numBattings = conn.prepareStatement(numBattingsQuery).executeQuery().getInt(1);
        return new Teacher(ttb, numFrees, numBattings, extraMuralHours, tName, hasRegisterClass);
    }
    public String [] getTeacherNames() throws SQLException
    {
        String [] teacherNames;
        
        String getNamesQuery = "SELECT `Name` FROM `tblTeachers`;";
        resultSet = conn.prepareStatement(getNamesQuery).executeQuery();
        teacherNames = new String [resultSet.getFetchSize()];
        int count = 0;
        while (resultSet.next())
        {
            teacherNames[count] = resultSet.getString(1);
            count++;
        }
        return teacherNames;
    }
//SELECT
    public ResultSet query(String stmt) throws SQLException
    {
        statement = conn.prepareStatement(stmt);
        resultSet = statement.executeQuery();


        return resultSet;
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
        String queryHeader = "INSERT INTO `tblTimeTables`(`ID`, `Day`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `L7`, `L8`, `L9`, `L10`, `L11`, `L12`, `L13`, `L14`)";
        String queryBody = "VALUES"+ getStringRepresentation(intbodyArr) +";";
        
        statement = conn.prepareStatement("" + queryHeader + queryBody);
        statement.executeUpdate();
        statement.close();
    }
    private void insertIntoTblTeachers(String fullName, int numFrees, boolean hasRegisterClass, int extraMuralHours) throws SQLException
    {
        
        String addTeacherQueryString = "INSERT INTO `jcjDB`.`tblTeachers` (`FullName`, `NumFrees`, `Register Class`, `ExtramuralHours`) \n" +
"VALUES ('"+ fullName +"', '"+ numFrees +"', '"+ ((hasRegisterClass)? 1:0) +"', '"+ extraMuralHours +"');";
        statement = conn.prepareStatement(addTeacherQueryString);
        statement.executeUpdate();
        statement.close();
    }
    private int getTeacherID(String fullName) throws SQLException
    {
        String getIDQuery = "Select `ID` FROM `jcjDB`.`tblTeachers`"
                + "WHERE `tblTeachers`.`FullName` = \""+ fullName +"\";";
        statement = conn.prepareStatement(getIDQuery);
        resultSet = statement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1);
    }
    private int [][] getInsertBodyArray(int id, TimeTable tt)
    {
        int [][] outputArr = new int [5][16];
        boolean [][] tempTimeTableArray = tt.getTimeTable();
        for (int dayCount = 0; dayCount < outputArr.length; dayCount++)
        {
            outputArr[dayCount][0] = id;
            outputArr[dayCount][1] = dayCount+1;
            
            for(int j = 2; j < outputArr[dayCount].length; j++)
            {
                //If true, output '1', else output '0'
                outputArr[dayCount][j] = (tempTimeTableArray[dayCount][j])? 1:0; 
            }
        }
        
        return outputArr;
    }
    private String getStringRepresentation(int [][] intArr)
    {
        String stringRepresentation = "";
        
        for (int [] arrayLvl1 : intArr)
        {
            stringRepresentation += "(";
            for (int iteratorLvl2 = 0; iteratorLvl2 < arrayLvl1.length; iteratorLvl2++)
            {
                stringRepresentation += (iteratorLvl2 != arrayLvl1.length-1)? arrayLvl1[iteratorLvl2] + ",": arrayLvl1[iteratorLvl2]; 
                //if this is the last cycle of the second level array, then don't add "," after the number^
            }
            stringRepresentation += ")";
        }
        
        return stringRepresentation;
    }    
}
