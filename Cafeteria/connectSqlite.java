

import java.sql.*; 
import javax.swing.*; 
import Gui_Package.*;



public class connectSqlite { 
    
    static String  dbp;
   
    Connection cin = null;  
    
     
    public static Connection dbConnector(String dp) { 
         dbp = dp;
        try{ 
        Class.forName("org.sqlite.JDBC"); 
        Connection conn = DriverManager.getConnection(dbp); 
        JOptionPane.showMessageDialog(null,"CONNECTION SUCCESSFULL!!!"); 
       cafeLogIn cl = new cafeLogIn("TRUE");
        System.out.println("SUCCESS");
        JOptionPane.showMessageDialog(null,"Connection successfull");
        return conn;
        } 
        
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"CONNECTION FAILED!!!"); 
       cafeLogIn cl = new cafeLogIn("FALSE");
        
        return null;
        }
        
      
    
}
}