package com.cipy.agendajdbc.model.response;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaResponse implements Serializable{

    private Integer codigoPersona;
    private String nombre;
    private String apellido;
}
