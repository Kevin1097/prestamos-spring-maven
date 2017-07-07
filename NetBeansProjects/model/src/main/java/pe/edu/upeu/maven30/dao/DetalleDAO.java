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
import pe.edu.upeu.maven30.model.Detalle;

/**
 *
 * @author junio
 */
public class DetalleDAO implements Operaciones<Detalle>{
 private final JdbcTemplate jdbcTemplate;
    public DetalleDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void saveOrUpdate(Detalle e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detalle> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Map<String,Object>> listarDetalle(int key)
    {
        
        String sql="SELECT d.IDDETALLE, v.IDVENTAS, v.FECHA, p.IDPRODUCTO, p.NOM_PRODUCTO, d.PRECIO, d.CANTIDAD,u.NOM_USER, c.NOMBRES, c.APELLIDOS FROM DETALLE d, VENTAS v, PRODUCTO p,USUARIO u,CLIENTE c " +
    "WHERE c.IDCLIENTE=v.IDCLIENTE AND u.IDUSUARIO=v.IDUSUARIO AND d.IDVENTAS = v.IDVENTAS AND d.IDPRODUCTO = p.IDPRODUCTO AND v.IDVENTAS="+key+"";
        
        return jdbcTemplate.queryForList(sql);
        
      
    }
    
}
