
package Hotel_Management_system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mysqlconnection {
   static Connection con;
   @SuppressWarnings("empty-statement")
    public static Connection getConnection() throws SQLException
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","123456"); 
          
        }  
        catch(ClassNotFoundException es)
        {
        } catch (InstantiationException | IllegalAccessException ex) {
           Logger.getLogger(mysqlconnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        return con;
    }

}
    
    

