/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.dao;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import pe.edu.upeu.maven30.interfaces.Operaciones;
import pe.edu.upeu.maven30.model.Detalle_PrestamoDTO;

/**
 *
 * @author Brandukosky
 */
public class Detalle_PrestamoDAO implements Operaciones<Detalle_PrestamoDTO>{
    
     private JdbcTemplate jt;
	
	public Detalle_PrestamoDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

    @Override
    public void saveOrUpdate(Detalle_PrestamoDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle_PrestamoDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detalle_PrestamoDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Map<String, Object>> DETALLE(int id) {
        String sql = "SELECT P.PRE_FECHA , P.PRE_LUGAR , EQ.EQ_TIPO , EQ.EQ_CANTIDAD ,DP.DPRE_ESTADO ,DP.DPRE_DESCRIPCION\n" +
                        "FROM DETALLE_PRESTAMO DP , PRESTAMO P , EQUIPO EQ \n" +
                            "WHERE  DP.EQ_ID = EQ.EQ_ID AND DP.PRE_ID = P.PRE_ID AND P.PRE_ID ='"+ id +"'";

        return jt.queryForList(sql);
    }
    
    public List<Map<String, Object>> DetalleDatosUsu( int id) {
        String sql = "SELECT  P.PRE_ID ,  U.US_NOMBRES ,  U.US_APELLIDOS , P.PRE_LUGAR , P.PRE_FECHA , P.PRE_RENOVACION  FROM PRESTAMO P , USUARIO U \n" +
                        "  WHERE P.US_ID = U.US_ID and P.PRE_ID ='"+ id +"'";

        return jt.queryForList(sql);
    }
    
}
