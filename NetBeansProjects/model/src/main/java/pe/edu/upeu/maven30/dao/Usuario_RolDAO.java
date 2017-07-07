/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import pe.edu.upeu.maven30.interfaces.Operaciones;
import pe.edu.upeu.maven30.model.Usuario_RolDTO;

/**
 *
 * @author Brandukosky
 */
public class Usuario_RolDAO implements Operaciones<Usuario_RolDTO>{
    
     private JdbcTemplate jt;
	
	public Usuario_RolDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(Usuario_RolDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario_RolDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario_RolDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
