
package com.cipy.agendajdbc.rowmapper;

import com.cipy.agendajdbc.dto.ActividadDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class ActividadRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ActividadDTO actividad = new ActividadDTO();
        actividad.setDateFin(rs.getDate("fecha_hora_fin"));
        actividad.setDateInicio(rs.getDate("fecha_hora_inicio"));
        actividad.setDescripcion(rs.getString("descripcion"));
        
        return actividad;
    }
    
}
