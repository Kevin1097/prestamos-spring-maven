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
public class Usuario_OpcionDTO {
    private String uso_fecha;
    private int op_id;
    private int us_id;

    public Usuario_OpcionDTO() {
    }

    public Usuario_OpcionDTO(String uso_fecha) {
        this.uso_fecha = uso_fecha;
    }

    public Usuario_OpcionDTO(String uso_fecha, int op_id, int us_id) {
        this.uso_fecha = uso_fecha;
        this.op_id = op_id;
        this.us_id = us_id;
    }

    public String getUso_fecha() {
        return uso_fecha;
    }

    public void setUso_fecha(String uso_fecha) {
        this.uso_fecha = uso_fecha;
    }

    public int getOp_id() {
        return op_id;
    }

    public void setOp_id(int op_id) {
        this.op_id = op_id;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }
    
}
