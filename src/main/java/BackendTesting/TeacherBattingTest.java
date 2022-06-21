/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class TeacherBattingTest
{
    private static boolean [][] t1 = {
        {true, false, false, true, false},
        {false, true, true, false, true},
        {false, true, false, false, true}
    };
    private static boolean [][] t2 = {
        {false, true, true, false, true},
        {true, true, true, true, false},
        {true, false, true, false, true}
    };
    private static boolean [][] t3 = {
        {false, true, true, true, true},
        {true, true, false, true, true},
        {true, false, true, false, true}
    };
    
    boolean [][][] teachers = {t1,t2,t3};
    
    public static void main(String[] args)
    {
        String battingTeacher = "";
        
        String dayStr = JOptionPane.showInputDialog("Enter day");
        int lesson = Integer.parseInt(JOptionPane.showInputDialog("Enter lesson")) -1;
        int battingDay;
//day to number in week convert, monday = 0, friday = 4
       if(dayStr.equalsIgnoreCase("Monday")) battingDay = 0; 
       else if(dayStr.equalsIgnoreCase("tuesday")) battingDay = 1; 
       else if(dayStr.equalsIgnoreCase("wednesday")) battingDay = 2; 
       else if(dayStr.equalsIgnoreCase("thursay")) battingDay = 3; 
       else battingDay = 4;
       
       
       String [] battingList = new String[5];
       
       for(int period = 0; period < 5; period ++)
       {
             if( ! t1[battingDay][period]) battingList[period] = "t1";
            else if ( ! t2[battingDay][period])battingList[period] = "t2";
            else if ( ! t3[battingDay][period])battingList[period] = "t3";
            else battingList[period] = "N/A";
       }
       
       //check which teacher depending on timetable
        
        System.out.println("Teacher batting list:\n"+ Arrays.toString(battingList));
    }
    
}
