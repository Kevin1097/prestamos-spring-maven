/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.model;

/**
 *
 * @author junio
 */
public class Venta {
    private int idventa;
    private String fecha;
    private int idcliente;
    private int idusuario;

    public Venta() {
    }

    public Venta(int idventa, String fecha, int idcliente, int idusuario) {
        this.idventa = idventa;
        this.fecha = fecha;
        this.idcliente = idcliente;
        this.idusuario = idusuario;
    }

    public Venta(String fecha, int idcliente, int idusuario) {
        this.fecha = fecha;
        this.idcliente = idcliente;
        this.idusuario = idusuario;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
}
