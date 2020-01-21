
package com.cipy.agendajdbc.dao;

import com.cipy.agendajdbc.model.response.PersonaResponse;
import com.cipy.agendajdbc.rowmapper.PersonaRowMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDao {
    @Autowired
    private JdbcTemplate jdbc;
    
    public List<PersonaResponse> findAll(){
        List<PersonaResponse> personas = (jdbc.query("SELECT cod_persona, nombre, apellido FROM persona", new PersonaRowMapper()));
        return personas;
    }
    
}
