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
import pe.edu.upeu.maven30.model.DetalleReservaDTO;

/**
 *
 * @author Brandukosky
 */
public class Detalle_ReservaDAO implements Operaciones<DetalleReservaDTO>{

     private JdbcTemplate jt;
	
	public Detalle_ReservaDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}
    
    @Override
    public void saveOrUpdate(DetalleReservaDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleReservaDTO read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetalleReservaDTO> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Map<String, Object>> DRESERVAS(int id) {
        String sql = "SELECT R.RE_ID , R.RE_FECHINICIO ,R.RE_FECHFIN , EQ.EQ_TIPO ,EQ.EQ_MARCA ,DR.DRE_DESCRIPCION ,DR.DRE_ESTADO\n" +
                        "FROM DETALLE_RESERVA DR , RESERVA R , EQUIPO EQ \n" +
                        "WHERE DR.RE_ID = R.RE_ID AND EQ.EQ_ID = DR.EQ_ID AND R.RE_ID = '"+ id +"' ";

        return jt.queryForList(sql);
    }
}
