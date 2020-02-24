package Mundo;

public class Usuario {
    /*
    * Atributos.
    */        
    private String nombres;
    
    private String priApellido;
    
    private String segApellido;
    
    private String Usuario;
    
    private String Contraseña;
    
    
    /*
    * Constructor.
    */
    public Usuario(String pNombres, String pPriApellido, String pSegApellido, String pUsuario, String pContraseña){
        this.nombres = pNombres;
        this.priApellido = pPriApellido;
        this.segApellido = pSegApellido;
        this.Usuario = pUsuario;
        this.Contraseña = pContraseña;
    }
    
    
    /*
    * Metodos.
    */
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPriApellido() {
        return priApellido;
    }

    public void setPriApellido(String priApellido) {
        this.priApellido = priApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
