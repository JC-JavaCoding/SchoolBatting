/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class LoginManager
{
    private static String username = "", password = "";
    
    public static boolean isValid(String userName, String passWord) //"main" method to see whether username and password are correct.
    {
        username = userName;
        password = passWord;
        try
        {
            File file = new File("data\\users.txt");
            Scanner fileScanner = new Scanner(file);

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
}
