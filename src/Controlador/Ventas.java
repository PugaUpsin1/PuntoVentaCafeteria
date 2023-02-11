
package Controlador;

public class Ventas {
    private int idVent;
    private double total;
    private String referencias;
    private String fecha;
    private String ids;
    private int cantidad;
    
    public Ventas() {
    }

    public Ventas(int idVent, double total, String ids) {
        this.idVent = idVent;
        this.total = total;
        this.ids = String.valueOf(idVent);
    }

    public int getIdVent() {
        return idVent;
    }

    public void setIdVent(int idVent) {
        this.idVent = idVent;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
    
    public String toString(){
        return ids;
    }
    
}
