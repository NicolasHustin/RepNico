
package com.cipy.agendajdbc.rowmapper;


import com.cipy.agendajdbc.dto.PersonaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class PersonaRowMapper implements RowMapper{

    @Override
    public PersonaDTO mapRow(ResultSet rs, int i) throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); 
      PersonaDTO persona = new PersonaDTO();
      persona.setCodigoPersona(rs.getInt("cod_persona"));
      persona.setNombre(rs.getString("nombre"));
      persona.setApellido(rs.getString("apellido"));
        
      return persona;
    }
}
