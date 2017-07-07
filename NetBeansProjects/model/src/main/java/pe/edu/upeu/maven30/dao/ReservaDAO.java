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
import pe.edu.upeu.maven30.model.ReservaDTO;

/**
 *
 * @author Brandukosky
 */
public class ReservaDAO implements Operaciones<ReservaDTO>{

     private JdbcTemplate jt;
	
	public ReservaDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(ReservaDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservaDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReservaDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void reservas (String p_fechainicio  , String p_fechafin  , String p_usid  , String p_descripcion,
                          String p_estado  , String p_eq_id ){
        
        String sql ="CALL SP_REGISTRO_RESERVA ( ? , ? ,? ,? ,? ,? )";
        jt.update(sql, p_fechainicio, p_fechafin , p_usid , p_descripcion , p_estado ,p_eq_id );
    }
}
