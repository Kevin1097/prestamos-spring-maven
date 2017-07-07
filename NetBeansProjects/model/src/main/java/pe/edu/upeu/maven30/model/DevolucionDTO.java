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
public class DevolucionDTO {
    private String dev_estado;
    private String dev_fecha;
    private int sa_id;
    private int pre_id;

    public DevolucionDTO() {
    }

    public DevolucionDTO(String dev_estado, String dev_fecha) {
        this.dev_estado = dev_estado;
        this.dev_fecha = dev_fecha;
    }

    public DevolucionDTO(String dev_estado, String dev_fecha, int sa_id, int pre_id) {
        this.dev_estado = dev_estado;
        this.dev_fecha = dev_fecha;
        this.sa_id = sa_id;
        this.pre_id = pre_id;
    }

    public String getDev_estado() {
        return dev_estado;
    }

    public void setDev_estado(String dev_estado) {
        this.dev_estado = dev_estado;
    }

    public String getDev_fecha() {
        return dev_fecha;
    }

    public void setDev_fecha(String dev_fecha) {
        this.dev_fecha = dev_fecha;
    }

    public int getSa_id() {
        return sa_id;
    }

    public void setSa_id(int sa_id) {
        this.sa_id = sa_id;
    }

    public int getPre_id() {
        return pre_id;
    }

    public void setPre_id(int pre_id) {
        this.pre_id = pre_id;
    }
    
    
}
