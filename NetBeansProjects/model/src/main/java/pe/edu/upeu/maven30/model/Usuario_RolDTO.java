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
public class Usuario_RolDTO {
    private String usr_fecha;
    private int us_id;
    private int ro_id;

    public Usuario_RolDTO() {
    }

    public Usuario_RolDTO(String usr_fecha, int us_id, int ro_id) {
        this.usr_fecha = usr_fecha;
        this.us_id = us_id;
        this.ro_id = ro_id;
    }

    public String getUsr_fecha() {
        return usr_fecha;
    }

    public void setUsr_fecha(String usr_fecha) {
        this.usr_fecha = usr_fecha;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }

    public int getRo_id() {
        return ro_id;
    }

    public void setRo_id(int ro_id) {
        this.ro_id = ro_id;
    }
    
    
}
