
package com.cipy.agendajdbc.rowmapper;

import com.cipy.agendajdbc.dto.AgendaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class AgendaRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       AgendaDTO agenda = new AgendaDTO();
       agenda.setCodigoAgenda(rs.getInt("cod_agenda"));
       agenda.setFecha(rs.getDate("fecha"));
       return agenda;
    }
    
}
