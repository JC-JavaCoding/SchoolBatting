/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.Backend;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author janch
 */
public class PrintWriterTrial 
{
    public static void main(String[] args) 
    {
        File file = new File ("data\\users.txt");
        String name = "Bigboy";
        String passkey = "enter";
        try 
            {
                FileWriter output = new FileWriter(file, true);
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
