package Mundo;

public class Cliente {
    private int id, ruta, idPrestamo;
    private String cedula, nombre, direccion, cobro, telefono, calificacion;

    public Cliente(String cedula, String nombre, String direccion, String cobro, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cobro = cobro;
        this.telefono = telefono;
    }

    public Cliente(int id, int ruta, String cedula, String nombre, String direccion, String cobro, String telefono, String calificacion) {
        this.id = id;
        this.ruta = ruta;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cobro = cobro;
        this.telefono = telefono;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCobro() {
        return cobro;
    }

    public void setCobro(String cobro) {
        this.cobro = cobro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
