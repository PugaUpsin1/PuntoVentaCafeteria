
package Modelo;

import Controlador.Gestion;
import Controlador.Productos;
import Controlador.Ventas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sqlGestion extends conexion{
    public ResultSet SelectVent(Gestion ges){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("""
                                        SELECT v.idVent, v.total, ve.Estado, m.Metodo, c.Nombre, c.Apellidos FROM ventas AS v 
                                        INNER JOIN venta_estado AS ve ON ve.idVE = v.IdVE
                                        INNER JOIN metodo_pago AS m ON m.idMP = v.idMP
                                        INNER JOIN Clientes AS c ON c.idCliente = v.idCliente
                                        WHERE v.fecha >='"""+ges.getFecha()+"' and v.fecha <= '"+ges.getFecha()+" 23:59:59';");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
    
    public ResultSet SelectMostProd(Ventas ven){
        Connection con;
        con = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("""
                                 SELECT vp.cantidad, p.nombre FROM venta_prod AS vp
                                 INNER JOIN productos AS p ON vp.idProducto = p.idProducto
                                 WHERE vp.idVent = 
                                 """ + ven.getIdVent());
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
}
    