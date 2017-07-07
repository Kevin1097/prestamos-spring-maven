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
public class UsuarioDTO {
    private int us_id;
    private String us_nombres;
    private String us_apellidos;
    private String us_user;
    private String us_clave;
    private String us_dni;
    private String us_celular;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String us_nombres, String us_apellidos, String us_user, String us_clave, String us_dni, String us_celular) {
        this.us_nombres = us_nombres;
        this.us_apellidos = us_apellidos;
        this.us_user = us_user;
        this.us_clave = us_clave;
        this.us_dni = us_dni;
        this.us_celular = us_celular;
    }

    public UsuarioDTO(int us_id, String us_nombres, String us_apellidos, String us_user, String us_clave, String us_dni, String us_celular) {
        this.us_id = us_id;
        this.us_nombres = us_nombres;
        this.us_apellidos = us_apellidos;
        this.us_user = us_user;
        this.us_clave = us_clave;
        this.us_dni = us_dni;
        this.us_celular = us_celular;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }

    public String getUs_nombres() {
        return us_nombres;
    }

    public void setUs_nombres(String us_nombres) {
        this.us_nombres = us_nombres;
    }

    public String getUs_apellidos() {
        return us_apellidos;
    }

    public void setUs_apellidos(String us_apellidos) {
        this.us_apellidos = us_apellidos;
    }

    public String getUs_user() {
        return us_user;
    }

    public void setUs_user(String us_user) {
        this.us_user = us_user;
    }

    public String getUs_clave() {
        return us_clave;
    }

    public void setUs_clave(String us_clave) {
        this.us_clave = us_clave;
    }

    public String getUs_dni() {
        return us_dni;
    }

    public void setUs_dni(String us_dni) {
        this.us_dni = us_dni;
    }

    public String getUs_celular() {
        return us_celular;
    }

    public void setUs_celular(String us_celular) {
        this.us_celular = us_celular;
    }
    
    
}
