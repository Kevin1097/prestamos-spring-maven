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
public class Detalle {
    private int iddetalle;
    private int idproducto;
    private int idventa;
    private double precio;
    private int cantidad;

    public Detalle() {
    }

    public Detalle(int iddetalle, int idproducto, int idventa, double precio, int cantidad) {
        this.iddetalle = iddetalle;
        this.idproducto = idproducto;
        this.idventa = idventa;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Detalle(int idproducto, int idventa, double precio, int cantidad) {
        this.idproducto = idproducto;
        this.idventa = idventa;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
