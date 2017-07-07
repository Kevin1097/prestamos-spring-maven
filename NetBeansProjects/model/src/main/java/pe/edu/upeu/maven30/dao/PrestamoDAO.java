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
import pe.edu.upeu.maven30.model.PrestamoDTO;

/**
 *
 * @author Brandukosky
 */
public class PrestamoDAO implements Operaciones<PrestamoDTO>{

     private JdbcTemplate jt;
	
	public PrestamoDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(PrestamoDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PrestamoDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PrestamoDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void Prestamo(String idUsuario , String idProdcuto , int cantidad , String lugar , String fecha , String dess
                         , String estado ){
        
        String sql ="CALL SP_REGISTRO_PRESTAMO ( ? , ? , ?  ,  ? ,  ? ,?  ,?  )";
        jt.update(sql, idUsuario, idProdcuto , cantidad , lugar , fecha ,dess , estado );
    }
    
}
