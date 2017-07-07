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
import pe.edu.upeu.maven30.model.SancionDTO;

/**
 *
 * @author Brandukosky
 */
public class SancionDAO implements Operaciones<SancionDTO>{

    
     private JdbcTemplate jt;
	
	public SancionDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(SancionDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SancionDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SancionDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
