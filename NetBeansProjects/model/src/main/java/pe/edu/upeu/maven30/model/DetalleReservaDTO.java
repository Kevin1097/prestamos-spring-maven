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
public class DetalleReservaDTO {
    private String dre_descripcion;
    private String dre_estado;
    private int re_id;
    private int eq_id;

    public DetalleReservaDTO() {
    }

    public DetalleReservaDTO(String dre_descripcion, String dre_estado) {
        this.dre_descripcion = dre_descripcion;
        this.dre_estado = dre_estado;
    }

    public DetalleReservaDTO(String dre_descripcion, String dre_estado, int re_id, int eq_id) {
        this.dre_descripcion = dre_descripcion;
        this.dre_estado = dre_estado;
        this.re_id = re_id;
        this.eq_id = eq_id;
    }

    public String getDre_descripcion() {
        return dre_descripcion;
    }

    public void setDre_descripcion(String dre_descripcion) {
        this.dre_descripcion = dre_descripcion;
    }

    public String getDre_estado() {
        return dre_estado;
    }

    public void setDre_estado(String dre_estado) {
        this.dre_estado = dre_estado;
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public int getEq_id() {
        return eq_id;
    }

    public void setEq_id(int eq_id) {
        this.eq_id = eq_id;
    }

    
}
