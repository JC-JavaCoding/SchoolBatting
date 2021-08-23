/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
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
        
        try
        {
            File info = new File("info.txt");
            Scanner sc = new Scanner(info).useDelimiter("#");
            sc.useLocale(Locale.US);
            while(sc.hasNextDouble())
            {
                System.out.println(""+ sc.nextDouble());
                System.out.println("Hello");
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
                System.out.println("oh no...");
        }
//        Scanner sc = new Scanner("100.1#100.5").useDelimiter("#");
//        sc.useLocale(Locale.US);
//            
//            while(sc.hasNextDouble())
//            {
//                System.out.println(""+ sc.nextDouble());
//                System.out.println("Hello");
//            }
//            sc.close();
    }
}
