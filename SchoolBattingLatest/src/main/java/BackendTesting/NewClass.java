
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;
import Backend.*;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.Arrays;
/**
 *
 * @author janch
 */
public class NewClass
{
    public static void main(String[] args)
    {
        int [][] iArr = {
            {1,1,1,0,1,0},
            {1,2,1,0,1,0},
            {1,3,1,0,1,0}
        };
        
        String output = "";
        for (int [] arr : iArr)
        {
            output += "" + Arrays.toString(iArr);
        }
        System.out.println(Arrays.deepToString(iArr));
    }
}
