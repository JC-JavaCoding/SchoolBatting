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
public class ScannerTest
{
    public static void main(String[] args)
    {
        try{
        Scanner sc = new Scanner(new File("info.txt")).useDelimiter("#");
        while(sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
        }
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
        sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("oh no...");
        }
    }
}
