package Mundo;

import java.util.Date;

public class Abono {
    private int id, idPrestamo;
    private Date fecha;
    private double valor, restante;
    private String tipo;

    public Abono(int id, Date fecha, double valor, String tipo, double restante) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.tipo = tipo;
        this.restante = restante;
    }
    
    public Abono(int id, Date fecha, double valor, String tipo, double restante, int idPrestamo) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.tipo = tipo;
        this.restante = restante;
        this.idPrestamo = idPrestamo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getRestante() {
        return restante;
    }

    public void setRestante(double restante) {
        this.restante = restante;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
