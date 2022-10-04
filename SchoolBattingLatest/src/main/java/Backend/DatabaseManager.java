/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Cliftonb
 */
public class DatabaseManager
{

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://102.130.115.69:3306/jcjDB";
    private static final String user = "jcj";
    private static final String pass = "Reddam2021";
    
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Connection conn;

    public DatabaseManager()
    {
        /**
         * Note: the following was added to the pom.xml:
         * <dependencies>
         * <dependency>
         * <groupId>mysql</groupId>
         * <artifactId>mysql-connector-java</artifactId>
         * <version>8.0.25</version>
         * </dependency>
         * </dependencies>
         */
        try
        {
            Class.forName(driver);
            System.out.println("DB: Driver found");
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB: Unable to load driver");
        }

        try
        {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("DB: Database connected");
        } catch (Exception e)
        {
            System.out.println("DB: Unable to load database");
        }
    }

    //INSERT, UPDATE or DELETE
    public void update(String update) throws SQLException
    {
        statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }
    public ResultSet query(String stmt) throws SQLException
    {
        statement = conn.prepareStatement(stmt);
        resultSet = statement.executeQuery();


        return resultSet;
    }
    public String processBookRequest(ResultSet rs)
    {
        try
        {
            String temp = "";
            ResultSetMetaData meta = rs.getMetaData();
            int size = meta.getColumnCount();
            while (rs.next())
            {
                int isbn = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                int rating = rs.getInt(4);
                double replacement_cost = rs.getDouble(5);

                temp += isbn + "#" + title + "#" + author + "#" + rating + "#" + replacement_cost;
            }

            return temp;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
