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
public class SancionDTO {
    private int sa_id;
    private String sa_estado;
    private String sa_tipo;

    public SancionDTO() {
    }

    public SancionDTO(String sa_estado, String sa_tipo) {
        this.sa_estado = sa_estado;
        this.sa_tipo = sa_tipo;
    }

    public SancionDTO(int sa_id, String sa_estado, String sa_tipo) {
        this.sa_id = sa_id;
        this.sa_estado = sa_estado;
        this.sa_tipo = sa_tipo;
    }

    public int getSa_id() {
        return sa_id;
    }

    public void setSa_id(int sa_id) {
        this.sa_id = sa_id;
    }

    public String getSa_estado() {
        return sa_estado;
    }

    public void setSa_estado(String sa_estado) {
        this.sa_estado = sa_estado;
    }

    public String getSa_tipo() {
        return sa_tipo;
    }

    public void setSa_tipo(String sa_tipo) {
        this.sa_tipo = sa_tipo;
    }
    
}
