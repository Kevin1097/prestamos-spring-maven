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
public class Detalle_PrestamoDTO {
    private String dpre_estado;
    private String descripcion;
    private int pre_id;
    private int equ_id;

    public Detalle_PrestamoDTO() {
    }

    public Detalle_PrestamoDTO(String dpre_estado, String descripcion) {
        this.dpre_estado = dpre_estado;
        this.descripcion = descripcion;
    }

    public Detalle_PrestamoDTO(String dpre_estado, String descripcion, int pre_id, int equ_id) {
        this.dpre_estado = dpre_estado;
        this.descripcion = descripcion;
        this.pre_id = pre_id;
        this.equ_id = equ_id;
    }

    public String getDpre_estado() {
        return dpre_estado;
    }

    public void setDpre_estado(String dpre_estado) {
        this.dpre_estado = dpre_estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPre_id() {
        return pre_id;
    }

    public void setPre_id(int pre_id) {
        this.pre_id = pre_id;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }
    
}
