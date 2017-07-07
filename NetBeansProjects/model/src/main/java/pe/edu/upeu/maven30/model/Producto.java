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
public class Producto {
    private int idproducto;
    private String nomproducto;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(int idproducto, String nomproducto, double precio, int cantidad) {
        this.idproducto = idproducto;
        this.nomproducto = nomproducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(String nomproducto, double precio, int cantidad) {
        this.nomproducto = nomproducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
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
