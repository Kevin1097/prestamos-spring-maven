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
import pe.edu.upeu.maven30.model.UsuarioDTO;

/**
 *
 * @author Brandukosky
 */
public class UsuarioDAO implements Operaciones<UsuarioDTO>{

     private JdbcTemplate jt;
	
	public UsuarioDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(UsuarioDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
