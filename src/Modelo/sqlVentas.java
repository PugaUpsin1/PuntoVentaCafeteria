
package Modelo;

import Controlador.Clientes;
import Controlador.MedodoPago;
import Controlador.Productos;
import Controlador.VentEstado;
import Controlador.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class sqlVentas extends conexion{
    
    
    public boolean AgregarVenta(Ventas ven , VentEstado ve, MedodoPago mp, Clientes cli){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO Ventas (total,referencias,fecha,idVE,idMP,idCliente) VALUE (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, 0.0);
            ps.setString(2, ven.getReferencias());
            ps.setString(3, ven.getFecha());
            ps.setInt(4, ve.getIdVE());
            ps.setInt(5, 1);
            ps.setInt(6, 1);
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
    
    public boolean InsertarProdVen(Productos prod, Ventas vent){
        PreparedStatement ps = null;
        Connection con = Conectar();
        String sql =  "INSERT INTO venta_prod (cantidad, idVent, idProducto) VALUE (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, vent.getCantidad());
            ps.setInt(2, vent.getIdVent());
            ps.setInt(3, prod.getIdPr());
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
    
    public ResultSet SelectCarrito(Ventas ven){  
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("""
                                 SELECT p.idProducto, p.nombre, p.tamaño, p.unidad,vp.cantidad,p.precioVent
                                 FROM productos AS p 
                                 INNER JOIN venta_prod AS vp ON vp.idProducto = p.idProducto 
                                 INNER JOIN ventas AS v ON vp.idVent = v.idVent 
                                 WHERE v.idVent = """+ven.getIdVent());
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    
    }
    
    public ArrayList<MedodoPago> getMetodoPago(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<MedodoPago> LP = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM metodo_pago");
            
            while(rs.next()){
                MedodoPago MP = new MedodoPago();
                MP.setIdMP(rs.getInt("idMP"));
                MP.setMetodo(rs.getString("Metodo"));
                LP.add(MP);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LP;
    }
    
    public ArrayList<Ventas> getVentasPend(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Ventas> VP = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM ventas WHERE idVE = 1");
            
            while(rs.next()){
                Ventas ven = new Ventas();
                ven.setIdVent(rs.getInt("idVent"));
                ven.setTotal(rs.getDouble("total"));
                VP.add(ven);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return VP;
    }
    
    public ArrayList<Clientes> getClientes(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<Clientes> CL = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Clientes");
            
            while(rs.next()){
                Clientes cli = new Clientes();
                cli.setIdCliente(rs.getInt("idCliente"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setApellidos(rs.getString("Apellidos"));
                CL.add(cli);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CL;
    }
    
    public boolean DeleteVentas(Ventas ven){  
        Connection con;
        con = Conectar();
        Statement st;
        
        try {
            st = con.createStatement();
            String sql = "DELETE FROM ventas WHERE idVent=" + ven.getIdVent();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
    }
    
    public boolean UpdateVen(Ventas vent, VentEstado ve, MedodoPago mp, Clientes cli){
        Connection con;
        con = Conectar();
        PreparedStatement ps;
        
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String fecha = dtf.format(dateObj);

        
        String sql = "UPDATE ventas SET total = ?, referencias = ?, fecha = ?, idVE = ?, idMP = ? ,idCliente = ? WHERE idVent = ?" ;        
        try{
            ps = con.prepareStatement(sql);
            ps.setDouble(1, vent.getTotal());
            ps.setString(2, vent.getReferencias());
            ps.setString(3, fecha);
            ps.setInt(4, ve.getIdVE());
            ps.setInt(5, mp.getIdMP());
            ps.setInt(6, cli.getIdCliente());
            ps.setInt(7, vent.getIdVent());
            System.out.println(ps);
            ps.execute();
            System.out.println(ps);            
            return true;
        }catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
    }
}
