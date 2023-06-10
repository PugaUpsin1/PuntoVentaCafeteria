
package Modelo;

import Controlador.MedodoPago;
import Controlador.TipoUsuario;
import Controlador.Usuarios;
import com.mysql.jdbc.Connection.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class sqlUsuarios extends conexion{
    
    public ResultSet SelectUsuarios(){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios;");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
    
    public boolean registrar(Usuarios usr){
        PreparedStatement ps = null;
        Connection con = Conectar();
        
        String sql =  "INSERT INTO usuarios(usuario,nombre,apellido,tel,password,id_tipo) VALUES (?,?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellido());
            ps.setString(4, usr.getTel());
            ps.setString(5, usr.getContra());
            ps.setInt(6,usr.getTipo());
            ps.execute();
            System.out.println(ps);
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            System.err.println(ex);
            return false;
        }
    }
    
    public boolean login(Usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Conectar();
        //SELECT u.idUsuario,u.usuario,u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo = t.id_tipo WHERE usuario = ?
        String sql = "SELECT u.idUsuario,u.usuario,u.password, u.nombre,u.apellido, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo = t.id_tipo WHERE usuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            System.out.println(ps);
            if(rs.next()){
                if(usr.getContra().equals(rs.getString(3))){
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setApellido(rs.getNString(5));
                    usr.setTipo(rs.getInt(6));
                    usr.setNombre_tipo(rs.getString(7));
                    
                   return true;
                    
                }else{
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(sqlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            return false;
        }
    }
    
    public ArrayList<TipoUsuario> getTipoUsuario(){
        Connection con = Conectar();
        Statement st;
        ResultSet rs = null;
        ArrayList<TipoUsuario> LT = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM tipo_usuario");
            
            while(rs.next()){
                TipoUsuario TU = new TipoUsuario();
                TU.setIdTipo(rs.getInt("id_tipo"));
                TU.setTipo(rs.getString("nombre"));
                LT.add(TU);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LT;
    }
    
    
}
