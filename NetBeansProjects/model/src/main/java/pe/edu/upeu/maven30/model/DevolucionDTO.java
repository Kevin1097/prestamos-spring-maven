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
    private String sa_id;
    private String pre_id;

    public DevolucionDTO() {
    }

    public DevolucionDTO(String dev_estado, String dev_fecha) {
        this.dev_estado = dev_estado;
        this.dev_fecha = dev_fecha;
    }

    public DevolucionDTO(String dev_estado, String dev_fecha, String sa_id, String pre_id) {
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

    public String getSa_id() {
        return sa_id;
    }

    public void setSa_id(String sa_id) {
        this.sa_id = sa_id;
    }

    public String getPre_id() {
        return pre_id;
    }

    public void setPre_id(String pre_id) {
        this.pre_id = pre_id;
    }
    
}
