
package Controlador;

/**
 *
 * @author issacpuga
 */
public class Categoria {
    private int idCat;
    private String Categoria;

    public Categoria() {
    }

    public Categoria(int idCat, String Categoria) {
        this.idCat = idCat;
        this.Categoria = Categoria;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public String toString(){
        return Categoria;
    }
}
