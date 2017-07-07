/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import pe.edu.upeu.maven30.interfaces.Operaciones;
import pe.edu.upeu.maven30.model.Venta;

/**
 *
 * @author junio
 */
public class VentaDAO implements Operaciones<Venta>{
 private final JdbcTemplate jdbcTemplate;
    public VentaDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
    @Override
    public void saveOrUpdate(Venta e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> list() {
        return null;
    }
    public List<Map<String,Object>> listar()
    {
        
        String sql="SELECT c.IDCLIENTE, c.NOMBRES,c.APELLIDOS, "+
            "c.DNI, u.IDUSUARIO, u.NOM_USER, v.FECHA, v.IDVENTAS  FROM VENTAS v, USUARIO u, CLIENTE c "+
            "WHERE v.IDCLIENTE=c.IDCLIENTE AND v.IDUSUARIO = u.IDUSUARIO";
        return jdbcTemplate.queryForList(sql);
        
      
    }
    
}
