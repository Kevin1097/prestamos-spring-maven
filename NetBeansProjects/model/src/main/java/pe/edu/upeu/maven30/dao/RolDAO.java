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
import pe.edu.upeu.maven30.model.Rol;

/**
 *
 * @author junio
 */
public class RolDAO implements Operaciones<Rol>{
    private final JdbcTemplate jdbcTemplate;
    public RolDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

    @Override
    public void saveOrUpdate(Rol e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> list() {
        String sql= "SELECT * FROM rol";
        List<Rol> listaRol=jdbcTemplate.query(sql, new RowMapper<Rol>(){
            @Override
            public Rol mapRow(ResultSet rs, int i) throws SQLException {
                Rol r= new Rol();
                r.setIdrol(rs.getInt("idRol"));
                r.setNomrol(rs.getString("Nom_rol"));
                return r;
            }
            
        });
        return listaRol;
    }
    
}
