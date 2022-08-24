
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendTesting;
import Backend.*;
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
            db.query("Select * FROM testTable;");
        }catch (java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }
}
