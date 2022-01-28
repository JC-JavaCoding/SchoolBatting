/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.UI;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author janch
 */
public class InputNumberedLengthTable
{   
    public static void main(String[] args)
    {
    }
    public static void addLap(double laptime, double fuelLoad)
    {
        /* set up the new frame
        */
        Stint frame = new Stint();
        
        /*Input the num rows*/
        //int rows = Integer.parseInt(JOptionPane.showInputDialog("Rows?"));
        int rows = 0;
        
//        File f = new File("resources/numlaps");
//        try
//        {
//          Scanner sc = new Scanner(f);
//          
//          rows = sc.nextInt();
//        }
//        catch (java.io.FileNotFoundException e)
//        {}
        /*add rows*/
//        int i;
//        for ( i = 1; i <= rows; i++)
//        {
            DefaultTableModel model = (DefaultTableModel) frame.jTable1.getModel();
            model.addRow(new Object[]{"" + laptime, "" + fuelLoad});
//        }
        
        frame.setVisible(true);
        
    }
}
