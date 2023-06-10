
package Controlador;


public class TipoUsuario {
    private int idTipo;
    private String Tipo;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipo, String Tipo) {
        this.idTipo = idTipo;
        this.Tipo = Tipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public String toString(){
        return Tipo;
    }
}
