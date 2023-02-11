
package Controlador;


public class VentEstado {
    private int idVE;
    private String Estado;

    public VentEstado() {
    }

    public VentEstado(int idVE, String Estado) {
        this.idVE = idVE;
        this.Estado = Estado;
    }

    public int getIdVE() {
        return idVE;
    }

    public void setIdVE(int idVE) {
        this.idVE = idVE;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
