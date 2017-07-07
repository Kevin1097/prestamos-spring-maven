/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        String sql = "DELETE FROM EQUIPO WHERE EQ_ID=?";
        jt.update(sql, id);
        
    }

    @Override
    public EquipoDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EquipoDTO> list() {
    
        String sql = "SELECT * FROM contact";
        List<EquipoDTO> listContact = jt.query(sql, new RowMapper<EquipoDTO>() {

            @Override
            public EquipoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                EquipoDTO eq = new EquipoDTO();

//                eq.(rs.getInt("contact_id"));
//                eq.setName(rs.getString("name"));
//                eq.setEmail(rs.getString("email"));
//                eq.setAddress(rs.getString("address"));
//                eq.setTelephone(rs.getString("telephone"));
//
//                return aContact;
            }

        });

        return listContact;
    
    }
    
}
