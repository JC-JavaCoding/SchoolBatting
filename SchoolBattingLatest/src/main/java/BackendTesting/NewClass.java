
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;
import Backend.*;
import java.sql.ResultSet;
/**
 *
 * @author janch
 */
public class NewClass
{
    public static void main(String[] args)
    {
        DatabaseManager db = new DatabaseManager();
        try
        {
            ResultSet dbResult = db.query("select * from testTable;");
            while (dbResult.next())
            {
                String line = dbResult.getString(1) +", "+ dbResult.getString(2) +", "+ dbResult.getString(3) +", "+ dbResult.getString(4);
                System.out.println(line);
            }
        }catch (java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }
}
