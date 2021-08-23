/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Jcj
 */
public class ScannerTest
{
    public static void main(String[] args)
    {
        
    }
    public static String testStratRead()
    {
        String str = "hgdxkjhgfckjhgfc";
        try
        {
            File info = new File("info.txt");
            Scanner sc = new Scanner(info).useDelimiter("#");
            sc.useLocale(Locale.US);
            
            //
            while(sc.hasNextDouble())
            {
                //System.out.println(""+ sc.nextDouble());
                str = "Hello";
                sc.next();
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            str = "oh no...";
        }
        return str;
    }
}
