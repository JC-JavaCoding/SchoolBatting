/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import static UI.UserLogin.currUser;
import UI.UserStrategies;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class UserManager
{
    private static String username = "", password = "";
    
    public static File usersFile = new File("data\\users.txt");
    public static File currentUser_File = new File("data\\currentUser.txt");
    public static boolean isValid(String userName, String passWord) //"main" method to see whether username and password are correct.
    {
        username = userName;
        password = passWord;
        try
        {
            Scanner fileScanner = new Scanner(usersFile);

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                Scanner lineScan = new Scanner(line).useDelimiter("#");

                String currName = lineScan.next();//current username, to check whether entered username is valid
                String currPassword = lineScan.next();//current password to check validity oof oit compared to user

                if (currName.equals(username) && currPassword.equals(password))
                {
                    return true;
                }
                lineScan.close();
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        return false;
    }
    public static boolean userExists(String username)
    {
        try
        {
            Scanner userScanner = new Scanner(usersFile);
            
            while (userScanner.hasNextLine())
            {
                String line = userScanner.nextLine();
                Scanner lineScanner = new Scanner (line).useDelimiter("#");
                String userInFile = lineScanner.next();
                System.out.println("userInfile: "+ userInFile +", username to check: "+username);
                if (userInFile.equals(username)) return true;
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        return false;
    }
    public static boolean passwordValid(String currentPassword)
    {
        if (currentPassword.equals(password))
        {
            System.out.println("Password correct");
            return true;
        }
        System.out.println("Password incorrect");
        return false;
    }
    public static void addCurrentUser(String user)
    {
        try
            {
                PrintWriter currUser_File = new PrintWriter( new FileWriter( currentUser_File ));
                currUser_File.print(user);

                currUser_File.close();
            }
            catch(java.io.IOException e)
            {
                JOptionPane.showMessageDialog(null,"IOException");
            }
    }
    public static void addUser(String name, String passkey, String confirmPasskey)
    {
        //if the confirm passkey is the same as the first password entered
        if(passkey.equals(confirmPasskey))
        {
            if ( !userExists(name) )//check whether username exists
            {
                try 
                {
                    FileWriter output = new FileWriter(usersFile, true);
                    PrintWriter userFile = new PrintWriter(output);
                    userFile.print(name +"#"+ passkey);
                    
                    userFile.close();
                    output.close();
                }
                catch(java.io.IOException e)
                {
                    System.out.println("IOException");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Username already exists");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Confirm Password differs from password entered");
        }
    }
    public static String getUsers()
    {
        String users = "";
        try
        {
            Scanner fileScanner = new Scanner(usersFile);
            while (fileScanner.hasNextLine())
            {
                Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter("#");
                users += lineScanner.next() +"\n";
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        return users;
    }
    public static String getCurrentUser()
    {
        String output = "";
        
        try
        {
            Scanner fileScanner = new Scanner(currentUser_File);
            output = fileScanner.next();
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        return output;
    }
}
