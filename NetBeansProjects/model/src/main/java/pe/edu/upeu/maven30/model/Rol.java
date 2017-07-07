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
public class Rol {
    private int idrol;
    private String nomrol;

    public Rol() {
    }

    public Rol(int idrol, String nomrol) {
        this.idrol = idrol;
        this.nomrol = nomrol;
    }

    public Rol(String nomrol) {
        this.nomrol = nomrol;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNomrol() {
        return nomrol;
    }

    public void setNomrol(String nomrol) {
        this.nomrol = nomrol;
    }
    
}
