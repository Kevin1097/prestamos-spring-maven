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
public class PrestamoDTO {
    private int pre_id;
    private String pre_fecha;
    private String pre_lugar;
    private String pre_descricion;
    private int pre_renovacion;
    private int us_id;

    public PrestamoDTO() {
    }

    public PrestamoDTO(String pre_fecha, String pre_lugar, String pre_descricion, int pre_renovacion, int us_id) {
        this.pre_fecha = pre_fecha;
        this.pre_lugar = pre_lugar;
        this.pre_descricion = pre_descricion;
        this.pre_renovacion = pre_renovacion;
        this.us_id = us_id;
    }

    public PrestamoDTO(int pre_id, String pre_fecha, String pre_lugar, String pre_descricion, int pre_renovacion, int us_id) {
        this.pre_id = pre_id;
        this.pre_fecha = pre_fecha;
        this.pre_lugar = pre_lugar;
        this.pre_descricion = pre_descricion;
        this.pre_renovacion = pre_renovacion;
        this.us_id = us_id;
    }

    public int getPre_id() {
        return pre_id;
    }

    public void setPre_id(int pre_id) {
        this.pre_id = pre_id;
    }

    public String getPre_fecha() {
        return pre_fecha;
    }

    public void setPre_fecha(String pre_fecha) {
        this.pre_fecha = pre_fecha;
    }

    public String getPre_lugar() {
        return pre_lugar;
    }

    public void setPre_lugar(String pre_lugar) {
        this.pre_lugar = pre_lugar;
    }

    public String getPre_descricion() {
        return pre_descricion;
    }

    public void setPre_descricion(String pre_descricion) {
        this.pre_descricion = pre_descricion;
    }

    public int getPre_renovacion() {
        return pre_renovacion;
    }

    public void setPre_renovacion(int pre_renovacion) {
        this.pre_renovacion = pre_renovacion;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }
    
    
}
