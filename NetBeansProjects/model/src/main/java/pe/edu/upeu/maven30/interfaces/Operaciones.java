/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.interfaces;

import java.util.List;

/**
 *
 * @author junio
 * @param <Entidad>
 */
public interface Operaciones<Entidad> {
    
    public void saveOrUpdate(Entidad e);
	
	public void delete(int id);
	
	public Entidad read(int id);
	
	public List<Entidad> list();
}
