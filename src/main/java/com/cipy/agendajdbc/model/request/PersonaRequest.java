
package com.cipy.agendajdbc.model.request;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaRequest implements Serializable{
    
    private Integer codigoPersona;
    private String nombre;
    private String apellido;
}
