
package Modelo;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;

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
        
    public Connection ConectarTest(){
        Connection cn = null;
        
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/punto_venta","root","");
                JOptionPane.showMessageDialog(null, "Se coneecto");
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(null, "Problemas al conectar: "+ ex);
            }
        return cn;
    }
}
