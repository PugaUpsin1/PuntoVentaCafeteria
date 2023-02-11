
package Controlador;


public class MedodoPago {
    private int idMP;
    private String Metodo;

    public MedodoPago() {
    }

    public MedodoPago(int idMP, String Metodo) {
        this.idMP = idMP;
        this.Metodo = Metodo;
    }

    public int getIdMP() {
        return idMP;
    }

    public void setIdMP(int idMP) {
        this.idMP = idMP;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    public String toString(){
        return Metodo;
    }
}
