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
import javax.swing.JOptionPane;

/**
 *
 * @author Jan-Christiaan
 */
public class StratManager
{
    final static File file = new File("data\\saved.txt");
    public static boolean strategyExists(String nameToCheck, String username)
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
                    System.out.println("Strategy already exists");
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
            if (!strategyExists(strategy, username))
            {
                FileWriter outputStream = new FileWriter(file, true);
                PrintWriter stratFile = new PrintWriter(outputStream);
                stratFile.print(username +"#"+ stratName +"#"+ strategy);

                outputStream.close();
                stratFile.close();
            }
        }
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
    
    public static String getSavedStrategies(String user)
    {
        //noice
        String output = "";
        
        try
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                String username = lineScanner.next();
                if (user.equals(username))
                {
                    String stratName = lineScanner.next();
                    String savedStrat = lineScanner.next();
                    output += stratName +": "+ savedStrat +"" + "\n";
                }
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File Not Found Exception");
        }
        
        return output;
    }
    public static String [] getStrategiesAsArray(String user)
    {
        String savedStrats = getSavedStrategies(user);
        
        Scanner numLinesScanner = new Scanner(savedStrats).useDelimiter("\n");
        int nrLines = 0;
        while (numLinesScanner.hasNextLine() ) 
        {
            System.out.println("Nr Lines: "+ nrLines);
            numLinesScanner.nextLine(); 
            nrLines ++;
        }
        
        Scanner stratScanner = new Scanner(savedStrats);
        String [] stratArr = new String[nrLines];
        for (int i = 1; i < nrLines; i++)
        {
            String line  = stratScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            System.out.println( "Line: "+ i +", "+  line  );
            
            if (lineScanner.next().equals(user))
            {
                stratArr[i-1] = line;
            }
        }
        return stratArr;
    }
                
    public static void deleteStrategy(String stratNameToDelete, String currUser)
    {
        try
        {
            FileWriter outputStream = new FileWriter(file, false);
            PrintWriter stratFile = new PrintWriter(outputStream);
            Scanner fileScanner = new Scanner(file); 
            
            String output ="";
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                String username = lineScanner.next();
                String stratName = lineScanner.next();
               
                if (!(currUser.equals(username) && stratName.equals(stratNameToDelete)))
                {
                    output += line +"\n";
                }
            }
            outputStream.close();
            stratFile.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
}
