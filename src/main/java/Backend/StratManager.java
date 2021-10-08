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
    //number of strategies saved under the user name, set when the class is called, set when scannin through strategies
    private static int numSavedStrats = 0;
    //this is the file being used by more than one method, but only once, thus final
    final static File file = new File("data\\saved.txt");
    
    //returns true if strategy name is found in file
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
                
                //check whether the strategy name already exists for the user
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
    //append file with a new strategy saved by name under the username
    public static void addStrategy(String username, String stratName, String strategy)
    {
        try
        {
            if (strategyExists(stratName, username) == false)
            {
                PrintWriter stratFile = new PrintWriter(new FileWriter(file, true));
                stratFile.print(username +"#"+ stratName +"#"+ strategy +"\n");

                stratFile.close();
                JOptionPane.showMessageDialog(null, "Added strategy");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This filename is already in use.");
            }
        }//noice
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
    //return a string representation of all strategies of user
    public static String getSavedStrategies(String user)
    {
        String output = "";
        try
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                //if username = the current user, add the strategy to the output
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
    //transform the string representation of the strategies to a string array representation.
    public static String [] getStrategiesAsArray(String user)
    {
        String savedStrats = getSavedStrategies(user);//string representation of the strategies
        Scanner stratScanner = new Scanner(savedStrats);
        String [] stratArr = new String[numSavedStrats];
        
        //each strategy (line) has a point in the array
        for (int i = 0; i < numSavedStrats; i++)
        {
            String line  = stratScanner.nextLine();
            stratArr[i] = line;
        }
        //set var to 0 for further use of class
        numSavedStrats = 0;
        return stratArr;
    }
    //rewrite all lnes into output string except the specified strategy, rewrite file as output string
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
                //for any other user than the current:
                if (!(currUser.equals(username)) )
                {
                    output += line +"\n";
                }
                else
                {
                    //delete the strategy that has the specified name by not including it in the output
                    if (!stratName.equals(stratNameToDelete))
                    {
                        output += line +"\n";
                    }
                }
            }
            PrintWriter stratFile = new PrintWriter(file);
            stratFile.print(output);
            stratFile.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("IOException in StratManager class");
        }
    }
}