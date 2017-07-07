/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import pe.edu.upeu.maven30.interfaces.Operaciones;
import pe.edu.upeu.maven30.model.UsuarioDTO;

/**
 *
 * @author Brandukosky
 */
public class UsuarioDAO implements Operaciones<UsuarioDTO>{

     private JdbcTemplate jt;
	@Autowired
	public UsuarioDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
       public UsuarioDTO Validar(String user, String pass) {
        String sql = "SELECT * FROM USUARIO WHERE US_USER = '" + user + "' AND US_CLAVE = '" + pass + "'";

        return jt.query(sql, new ResultSetExtractor<UsuarioDTO>() {

            @Override
            public UsuarioDTO extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    UsuarioDTO c = new UsuarioDTO();
                    c.setUs_user(rs.getString("US_USER"));
                    c.setUs_clave(rs.getString("US_CLAVE"));
                   
                    return c;
                }
                return null;
            }

            
        });

    }
    
    @Override
    public void saveOrUpdate(UsuarioDTO e) {
        if (e.getUs_id()>0) {
            
        }
        else
        {
            String sql="CALL SP_REGISTRO_USER(?,?,?,?,?,?)";
            jt.update(sql, e.getUs_nombres(),e.getUs_apellidos(),e.getUs_dni(),e.getUs_celular(),e.getUs_user(),e.getUs_clave());
        }
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
