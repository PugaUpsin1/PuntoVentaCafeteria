
package Controlador;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.*;

public class conexion {
    
        public Connection Conectar(){
        Connection cn = null;
        
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/punto_venta","root","");
     
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        return cn;
    }
        
        public static void main(String[] args) {
            
    }
}
