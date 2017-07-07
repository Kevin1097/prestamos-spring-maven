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
public class ReservaDTO {
    
    private int re_id;
    private String re_fechainicio;
    private String re_fechafin;
    private int us_id;

    public ReservaDTO() {
    }

    public ReservaDTO(String re_fechainicio, String re_fechafin) {
        this.re_fechainicio = re_fechainicio;
        this.re_fechafin = re_fechafin;
    }

    public ReservaDTO(String re_fechainicio, String re_fechafin, int us_id) {
        this.re_fechainicio = re_fechainicio;
        this.re_fechafin = re_fechafin;
        this.us_id = us_id;
    }

    public ReservaDTO(int re_id, String re_fechainicio, String re_fechafin, int us_id) {
        this.re_id = re_id;
        this.re_fechainicio = re_fechainicio;
        this.re_fechafin = re_fechafin;
        this.us_id = us_id;
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public String getRe_fechainicio() {
        return re_fechainicio;
    }

    public void setRe_fechainicio(String re_fechainicio) {
        this.re_fechainicio = re_fechainicio;
    }

    public String getRe_fechafin() {
        return re_fechafin;
    }

    public void setRe_fechafin(String re_fechafin) {
        this.re_fechafin = re_fechafin;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }
    
}
