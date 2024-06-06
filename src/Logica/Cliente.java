package Logica;
public class Cliente {
    private String dni;
    private String nombre;
    private String prApellido;
    private String sgApellido;

    public Cliente(String dni, String nombre, String prApellido, String sgApellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.prApellido = prApellido;
        this.sgApellido = sgApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrApellido() {
        return prApellido;
    }

    public void setPrApellido(String prApellido) {
        this.prApellido = prApellido;
    }

    public String getSgApellido() {
        return sgApellido;
    }

    public void setSgApellido(String sgApellido) {
        this.sgApellido = sgApellido;
    }
}
