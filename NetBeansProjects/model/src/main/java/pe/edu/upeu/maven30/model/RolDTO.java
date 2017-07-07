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
public class RolDTO {
    private int ro_id;
    private String ro_nombre;

    public RolDTO() {
    }

    public RolDTO(String ro_nombre) {
        this.ro_nombre = ro_nombre;
    }

    public RolDTO(int ro_id, String ro_nombre) {
        this.ro_id = ro_id;
        this.ro_nombre = ro_nombre;
    }

    public int getRo_id() {
        return ro_id;
    }

    public void setRo_id(int ro_id) {
        this.ro_id = ro_id;
    }

    public String getRo_nombre() {
        return ro_nombre;
    }

    public void setRo_nombre(String ro_nombre) {
        this.ro_nombre = ro_nombre;
    }
    
}
