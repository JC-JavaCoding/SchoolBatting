/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jan-Christiaan
 */
public class StratManager
{
    private static File file = new File("data/saved.txt");
    public static boolean exists(String nameToCheck, String username)
    {
        try
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                String user = lineScanner.next();
                String stratName = lineScanner.next();
                if( username.equals(user) && stratName.equals(nameToCheck) )
                {
                   return true; 
                }
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found in StratManager class.");
        }
        return false;
    }
    
    public static void addStrategy(String username, String stratName, String strategy)
    {
        try
        {
            FileWriter outputStream = new FileWriter(file);
            PrintWriter stratFile = new PrintWriter(outputStream, true);
            stratFile.print(username +"#"+ stratName +"#"+ strategy);
            
            outputStream.close();
            stratFile.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
}
