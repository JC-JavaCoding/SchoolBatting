/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

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
//    public static void setValues(String userName, String passWord)//set the username and password, check if it matches
//    {
//        username = userName;
//        password = passWord;
//    }

    public static boolean userValid(String currentName)
    {
        if (currentName.equals(username))
        {
            System.out.println("Username correct");
            return true;
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
    public static boolean userExists(String username)
    {
        try
        {
            Scanner userScanner = new Scanner(usersFile);
            
            while (userScanner.hasNextLine())
            {
                String line = userScanner.nextLine();
                Scanner lineScanner = new Scanner (line);
                String userInFile = lineScanner.next();
                
                if (userInFile.equals(username)) return true;
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        return false;
    }
    public static void addUser(String name, String passkey)
    {
        if ( !userExists(name) )//check whether username exists
        {
            
            try 
            {
                FileWriter output = new FileWriter(usersFile, true);
                PrintWriter userFile = new PrintWriter(output);
                userFile.print(name +"#"+ passkey);
                System.out.println(name +"#"+ passkey);
                
                userFile.close();
                output.close();
            }
            catch(java.io.IOException e)
            {
                System.out.println("IOException");
            }
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
