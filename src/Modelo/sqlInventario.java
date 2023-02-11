package Modelo;

import Controlador.Inventario;
import Controlador.Productos;
import Controlador.Usuarios;
import com.mysql.jdbc.Connection.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlInventario extends conexion{
    
    public ResultSet SelectInventario(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM inventario;");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
    
    public boolean Agregar(Inventario inv){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO inventario (nombre,Cantidad,unidad,PrecioUni,Proveedor) VALUE (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inv.getNombre());
            ps.setDouble(2, inv.getCantidad());
            ps.setString(3, inv.getUnidad());
            ps.setDouble(4, inv.getPreUnit());
            ps.setString(5, inv.getProveedores());
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean Modificar(Inventario inv){
        PreparedStatement ps = null;
        Connection con = Conectar();
        
        String sql = "UPDATE inventario SET nombre = ?, Cantidad = ?,PrecioUni = ?, Proveedor = ? WHERE idInventario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inv.getNombre());
            ps.setDouble(2, inv.getCantidad());
            ps.setDouble(3, inv.getPreUnit());
            ps.setString(4, inv.getProveedores());
            ps.setInt(5, inv.getIdInv());
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public ResultSet BuscarInv(Inventario inv){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM inventario WHERE idInventario='"+inv.getIdInv()+"';");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet BuscarInvNombre(Inventario inv){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM inventario WHERE idInventario='"+inv.getNombre()+"';");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
        }
        return rs;
    }
    
    public ArrayList<Inventario> getInventario(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Inventario> LI = new ArrayList<>();  
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM inventario");
            
            while(rs.next()){
                Inventario inv = new Inventario();
                inv.setIdInv(rs.getInt("idInventario"));
                inv.setNombre(rs.getString("nombre"));
                LI.add(inv);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LI;
    }
}
