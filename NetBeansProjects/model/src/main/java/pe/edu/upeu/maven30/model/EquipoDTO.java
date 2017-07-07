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
public class EquipoDTO {
    private String eq_id;
    private String eq_marca;
    private String eq_serie;
    private String eq_tipo;
    private int eq_cantidad;
    private String eq_estado;

    public EquipoDTO() {
    }

    public EquipoDTO(String eq_marca, String eq_serie, String eq_tipo, int eq_cantidad, String eq_estado) {
        this.eq_marca = eq_marca;
        this.eq_serie = eq_serie;
        this.eq_tipo = eq_tipo;
        this.eq_cantidad = eq_cantidad;
        this.eq_estado = eq_estado;
    }

    public EquipoDTO(String eq_id, String eq_marca, String eq_serie, String eq_tipo, int eq_cantidad, String eq_estado) {
        this.eq_id = eq_id;
        this.eq_marca = eq_marca;
        this.eq_serie = eq_serie;
        this.eq_tipo = eq_tipo;
        this.eq_cantidad = eq_cantidad;
        this.eq_estado = eq_estado;
    }

    public String getEq_id() {
        return eq_id;
    }

    public void setEq_id(String eq_id) {
        this.eq_id = eq_id;
    }

    public String getEq_marca() {
        return eq_marca;
    }

    public void setEq_marca(String eq_marca) {
        this.eq_marca = eq_marca;
    }

    public String getEq_serie() {
        return eq_serie;
    }

    public void setEq_serie(String eq_serie) {
        this.eq_serie = eq_serie;
    }

    public String getEq_tipo() {
        return eq_tipo;
    }

    public void setEq_tipo(String eq_tipo) {
        this.eq_tipo = eq_tipo;
    }

    public int getEq_cantidad() {
        return eq_cantidad;
    }

    public void setEq_cantidad(int eq_cantidad) {
        this.eq_cantidad = eq_cantidad;
    }

    public String getEq_estado() {
        return eq_estado;
    }

    public void setEq_estado(String eq_estado) {
        this.eq_estado = eq_estado;
    }
    
}
