
package Modelo;

import Controlador.Categoria;
import Controlador.Inventario;
import Controlador.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class sqlProductos extends conexion{
    
    public ResultSet SelectProductos(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT p.idProducto, p.nombre, p.tamaño, p.tamaño, p.unidad,p.precioVent, c.Categoria FROM productos AS p INNER JOIN categoria_pr AS c ON p.idCatego = c.idCatego");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
    
    public boolean Agregar(Productos prod, Categoria cat){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO productos (nombre,tamaño,unidad,precioVent,idCatego) VALUE (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setDouble(2, prod.getMedida());
            ps.setString(3, prod.getUnidad());
            ps.setDouble(4, prod.getPrecioVenta());
            ps.setInt(5, cat.getIdCat());
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public ResultSet BuscarIngre(Productos prod){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT r.idInventario, r.ingrediente, r.cantidad, r.unidad FROM receta_prod AS r INNER JOIN productos AS p ON r.idProducto=p.idProducto WHERE p.idProducto ='"+prod.getIdPr()+"';");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
        }
        return rs;
    }
    
    public ArrayList<Productos> getProductos(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Productos> LP = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos");
            
            while(rs.next()){
                Productos pr = new Productos();
                pr.setIdPr(rs.getInt("idProducto"));
                pr.setNombre(rs.getString("nombre"));
                LP.add(pr);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LP;
    }
    
    public boolean AgregarIngreReceta(Productos prod, Inventario inv){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO receta_prod (ingrediente, cantidad, unidad, idProducto, idInventario) VALUES (?,?,?,?,?) ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getIngrediente());
            ps.setDouble(2, prod.getCantIngr());
            ps.setString(3, prod.getUndIngre());
            ps.setInt(4, prod.getIdPr());
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
    
    public ResultSet Select(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos;");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
        
    public ResultSet SelectCategoria(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM categoria_pr;");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
        
    public boolean AgregarCatego(Productos prod){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO categoria_pr (Categoria) VALUE (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCategoria());
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.out.println(ex);
            return false;
        }
    }     
    
    public ArrayList<Categoria> getCategoria(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Categoria> LC = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM categoria_pr");
            
            while(rs.next()){
                Categoria cat = new Categoria();
                cat.setIdCat(rs.getInt("idCatego"));
                cat.setCategoria(rs.getString("Categoria"));
                LC.add(cat);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LC;
    }    
    
    public ArrayList<Productos> getProductosVen(Integer IdCat){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Productos> LP = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos WHERE idCatego ="+IdCat);
            
            while(rs.next()){
                Productos pr = new Productos();
                pr.setIdPr(rs.getInt("idProducto"));
                pr.setNombre(rs.getString("nombre"));
                pr.setMedida(rs.getDouble("tamaño"));
                pr.setUnidad(rs.getString("unidad"));
                pr.setPrecioVenta(rs.getDouble("precioVent"));
                LP.add(pr);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LP;
    }
    
    

        
    
        
}
