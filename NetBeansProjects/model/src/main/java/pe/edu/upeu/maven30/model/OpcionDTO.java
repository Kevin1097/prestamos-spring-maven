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
public class OpcionDTO  {
    private int op_id;
    private int op_codpadre;
    private String op_nombre;
    private String op_descripcion;
    private String op_enlace;
    private String op_estado;

    public OpcionDTO() {
    }

    public OpcionDTO(int op_id, String op_nombre, String op_descripcion, String op_enlace, String op_estado) {
        this.op_id = op_id;
        this.op_nombre = op_nombre;
        this.op_descripcion = op_descripcion;
        this.op_enlace = op_enlace;
        this.op_estado = op_estado;
    }

    public OpcionDTO(int op_id, int op_codpadre, String op_nombre, String op_descripcion, String op_enlace, String op_estado) {
        this.op_id = op_id;
        this.op_codpadre = op_codpadre;
        this.op_nombre = op_nombre;
        this.op_descripcion = op_descripcion;
        this.op_enlace = op_enlace;
        this.op_estado = op_estado;
    }

    public int getOp_id() {
        return op_id;
    }

    public void setOp_id(int op_id) {
        this.op_id = op_id;
    }

    public int getOp_codpadre() {
        return op_codpadre;
    }

    public void setOp_codpadre(int op_codpadre) {
        this.op_codpadre = op_codpadre;
    }

    public String getOp_nombre() {
        return op_nombre;
    }

    public void setOp_nombre(String op_nombre) {
        this.op_nombre = op_nombre;
    }

    public String getOp_descripcion() {
        return op_descripcion;
    }

    public void setOp_descripcion(String op_descripcion) {
        this.op_descripcion = op_descripcion;
    }

    public String getOp_enlace() {
        return op_enlace;
    }

    public void setOp_enlace(String op_enlace) {
        this.op_enlace = op_enlace;
    }

    public String getOp_estado() {
        return op_estado;
    }

    public void setOp_estado(String op_estado) {
        this.op_estado = op_estado;
    }
    
    
}
