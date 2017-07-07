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
public class Usuario {
    private int idusuario;
    private String user;
    private String clave;
    private int idrol;
    public Usuario() {
    }

    public Usuario(int idusuario, String user, String clave, int idrol) {
        this.idusuario = idusuario;
        this.user = user;
        this.clave = clave;
        this.idrol = idrol;
    }

    public Usuario(String user, String clave, int idrol) {
        this.user = user;
        this.clave = clave;
        this.idrol = idrol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    
    
    
    
}
