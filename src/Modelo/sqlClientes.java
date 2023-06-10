
package Modelo;

import Controlador.Clientes;
import Controlador.Inventario;
import Controlador.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sqlClientes extends conexion{
    
    
    
    
    public ResultSet SelectClien(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM clientes;");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
    
    
    public boolean Agregar(Clientes cli){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO clientes (Nombre,Apellidos,Edad,Telefono,Email, NumVisi) VALUE (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellidos());
            ps.setInt(3, cli.getEdad());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getEmail());
            ps.setInt(6, cli.getNumVisi());
            System.out.println(ps);
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean DeleteClien(Clientes cli){  
        Connection con;
        con = Conectar();
        Statement st;
        
        try {
            st = con.createStatement();
            String sql = "DELETE FROM clientes WHERE idCliente=" + cli.getIdCliente();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
    }
}
