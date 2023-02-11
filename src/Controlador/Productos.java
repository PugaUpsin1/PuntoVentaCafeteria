package Controlador;

public class Productos {

    private int idPr;
    private String nombre;
    private double medida;
    private String Unidad;
    private double precioVenta;
    private int idCatego;
    private String Categoria;
    private String ingrediente;
    private double CantIngr;
    private String UndIngre;

    public Productos() {
    }

    public Productos(int idPr, String nombre) {
        this.idPr = idPr;
        this.nombre = nombre;
    }
    

    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getIdCatego() {
        return idCatego;
    }

    public void setIdCatego(int idCatego) {
        this.idCatego = idCatego;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCantIngr() {
        return CantIngr;
    }

    public void setCantIngr(double CantIngr) {
        this.CantIngr = CantIngr;
    }

    public String getUndIngre() {
        return UndIngre;
    }

    public void setUndIngre(String UndIngre) {
        this.UndIngre = UndIngre;
    }

    public String toString(){
        return nombre;
    }
}
