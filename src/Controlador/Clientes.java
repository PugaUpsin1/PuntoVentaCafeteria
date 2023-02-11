
package Controlador;


public class Clientes {
    private int idCliente;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private int Telefono;
    private String Email;
    private int NumVisi;

    public Clientes() {
    }

    public Clientes(int idCliente, String Nombre, String Apellidos) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }
    
    

    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumVisi() {
        return NumVisi;
    }

    public void setNumVisi(int NumVisi) {
        this.NumVisi = NumVisi;
    }
    
    public String toString(){
        return Nombre + " " + Apellidos;
    }
    
}
