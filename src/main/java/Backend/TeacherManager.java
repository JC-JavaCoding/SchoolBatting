/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author janch
 */
public class TeacherManager
{
    private Teacher teacher = new Teacher();
    private static File f = new File("data/teachers.txt");
    
    public boolean isFree(int day, int lesson)
    {
        return teacher.timeTable [day][lesson];
    }
    
    public void addTeacher(String name, boolean [][] timeTable,int count)
    {
        teacher.fullName = name;
        teacher.numBattings = count;
        teacher.timeTable = timeTable;
        
        try
        {
            FileWriter fw = new FileWriter(f, true);
            fw.append(teacher.toString() +"\n");
            fw.close();
        }catch(java.io.IOException e)
        {
            System.out.println("file not found");
        }
    }
}
