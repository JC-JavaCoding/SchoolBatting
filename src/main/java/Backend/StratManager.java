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
    
    private static int numSavedStrats = 0;
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
                System.out.println("Username: "+ user +", username to check: "+ username +", strategy name: "+ stratName +", strategy name to check: "+ nameToCheck);
                if( username.equals(user) && stratName.equals(nameToCheck) )
                {
                    JOptionPane.showMessageDialog(null, "Strategy already exists");
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
            if (strategyExists(stratName, username) == false)
            {
                //FileWriter outputStream = new FileWriter(file, true);
                PrintWriter stratFile = new PrintWriter(new FileWriter(file, true));
                stratFile.print(username +"#"+ stratName +"#"+ strategy +"\n");

                //outputStream.close();
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
                    numSavedStrats ++;
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
        //System.out.println("number saved strats: "+numSavedStrats);
        Scanner stratScanner = new Scanner(savedStrats);
        String [] stratArr = new String[numSavedStrats];
        for (int i = 0; i < numSavedStrats; i++)
        {
            String line  = stratScanner.nextLine();
            //System.out.println( "Line: "+ i +", "+  line  );
            stratArr[i] = line;
        }
        //System.out.println("End of getStratsAsArray method");
        numSavedStrats = 0;
        return stratArr;
    }
                
    public static void deleteStrategy(String stratToDelete, String currUser)
    {
        Scanner selectedScanner = new Scanner(stratToDelete).useDelimiter(":");
        String stratNameToDelete = selectedScanner.next();
        try
        {
            Scanner fileScanner = new Scanner(file); 
            
            String output = "";
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                String username = lineScanner.next();
                String stratName = lineScanner.next();
                /*ERROR CHECKING*/
                System.out.println("username: "+username+", strategy name: "+stratName);
                System.out.println("current user: "+currUser+", strategy to delete: "+stratNameToDelete);
                /**/
                if (!(currUser.equals(username)) )
                {
                    output += line +"\n";
                    /*ERROR CHECKING*/
                    System.out.println(line);
                    /**/
                }
                else
                {
                    if (!stratName.equals(stratNameToDelete))
                    {
                        output += line +"\n";
                        /*ERROR CHECKING*/
                        System.out.println(line);
                        /**/
                    }
                }
            }
            PrintWriter stratFile = new PrintWriter(file);
            stratFile.print(output);
            //outputStream.close();
            stratFile.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
    
}
