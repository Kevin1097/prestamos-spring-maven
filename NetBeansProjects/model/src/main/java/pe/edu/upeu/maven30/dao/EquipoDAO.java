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
import pe.edu.upeu.maven30.model.EquipoDTO;

/**
 *
 * @author Brandukosky
 */
public class EquipoDAO implements Operaciones<EquipoDTO>{

     private JdbcTemplate jt;
	
	public EquipoDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(EquipoDTO e) {
        
//        if (e.getId() > 0) {
//            // update
//            String sql = "UPDATE contact SET name=?, email=?, address=?, "
//                    + "telephone=? WHERE contact_id=?";
//            jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
//                    contact.getAddress(), contact.getTelephone(), contact.getId());
//        } else {
//            // insert
//            String sql = "INSERT INTO contact (name, email, address, telephone)"
//                    + " VALUES (?, ?, ?, ?)";
//            jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
//                    contact.getAddress(), contact.getTelephone());
//        }
//    
        
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EquipoDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EquipoDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
