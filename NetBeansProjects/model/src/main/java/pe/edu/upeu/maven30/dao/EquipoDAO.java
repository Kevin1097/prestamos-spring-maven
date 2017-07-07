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
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
        
        if (e.getEq_id() > 0) {
            // update
            String sql = "UPDATE EQUIPO SET EQ_MARCA =?, EQ_SERIE =?, EQ_TIPO =?, "
                    + "EQ_CANTIDAD = ? , EQ_ESTADO =? WHERE EQ_ID=?";
            jt.update(sql, e.getEq_marca(), e.getEq_serie(), e.getEq_tipo(), e.getEq_cantidad(), e.getEq_estado() , e.getEq_id());
        } else {
            // insert
            String sql = "INSERT INTO EQUIPO (EQ_ID , EQ_MARCA , EQ_SERIES, EQ_TIPO, EQ_CANTIDAD ,EQ_ESTADO)"
                    + " VALUES (NULL, ?, ?, ?, ?, ?)";
            jt.update(sql, e.getEq_marca(), e.getEq_serie(), e.getEq_tipo(), e.getEq_cantidad(), e.getEq_estado());
        }
    
        
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM EQUIPO WHERE EQ_ID=?";
        jt.update(sql, id);
        
    }

    @Override
    public EquipoDTO read(int id) {
        String sql = "SELECT * FROM EQUIPO WHERE EQ_ID= " + id;
        return jt.query(sql, new ResultSetExtractor<EquipoDTO>() {

            @Override
            public EquipoDTO extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    EquipoDTO eq = new EquipoDTO();
                    eq.setEq_id(rs.getInt("EQ_ID"));
                    eq.setEq_marca(rs.getString("EQ_MARCA"));
                    eq.setEq_serie(rs.getString("EQ_SERIE"));
                    eq.setEq_tipo(rs.getString("EQ_TIPO"));
                    eq.setEq_cantidad(rs.getInt("EQ_CANTIDAD"));
                    eq.setEq_estado(rs.getString("EQ_ESTADO"));
                    
                    return eq;
                }

                return null;
            }

        });    
    
    }
    @Override
    public List<EquipoDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Map<String, Object>> ListarEquipo() {
    
        String sql = "SELECT * FROM EQUIPO";
        return jt.queryForList(sql);
    }
}
