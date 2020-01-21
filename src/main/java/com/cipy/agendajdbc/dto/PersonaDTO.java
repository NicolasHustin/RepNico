
package com.cipy.agendajdbc.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO implements Serializable{
    
    private Integer codigoPersona ;
    private String nombre;
    private String apellido;
}
