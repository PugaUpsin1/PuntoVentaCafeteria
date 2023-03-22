
package Controlador;

public class Inventario {
    private int idInv;
    private String Nombre;
    private double Cantidad;
    private String Unidad;
    private double PreUnit;
    private String Proveedores;
    private double cingr;

    public Inventario() {
    }

    public Inventario(int idInv, String Nombre) {
        this.idInv = idInv;
        this.Nombre = Nombre;
    }
    
    

    public int getIdInv() {
        return idInv;
    }

    public void setIdInv(int idInv) {
        this.idInv = idInv;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getPreUnit() {
        return PreUnit;
    }

    public void setPreUnit(double PreUnit) {
        this.PreUnit = PreUnit;
    }

    public String getProveedores() {
        return Proveedores;
    }

    public void setProveedores(String Proveedores) {
        this.Proveedores = Proveedores;
    }

    public double getCingr() {
        return cingr;
    }

    public void setCingr(double cingr) {
        this.cingr = cingr;
    }
    
    
    
    public String toString(){
        return Nombre;
    }
}
