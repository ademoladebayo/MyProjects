/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_account;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ADEBAYO ADEMOLA
 */
public class schdbconnect { 
    
    static String  dbp;
   
    Connection cin = null;  
    
     
    public static Connection dbConnector(String dp) { 
         dbp = dp;
        try{ 
        Class.forName("org.sqlite.JDBC"); 
        Connection conn = DriverManager.getConnection(dbp); 
        JOptionPane.showMessageDialog(null,"CONNECTION SUCCESSFULL!!!"); 
        acctLogin al = new acctLogin("TRUE");
        
        
        return conn;
        } 
        
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"CONNECTION FAILED!!!"); 
        acctLogin al = new acctLogin("FALSE");
        
        return null;
        }
        
      
    
}
}
