/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author EJ
 */
public class mysqlConnection {
    
    // CONNECT to database
    
    Connection conn = null;
    public static Connection dbConnector(){
     try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/Examination_System", "root", "123456");
        //JOptionPane.showMessageDialog(null, "Connection Successful");
        return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
