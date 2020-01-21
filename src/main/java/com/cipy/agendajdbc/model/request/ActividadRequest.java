
package com.cipy.agendajdbc.model.request;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActividadRequest implements Serializable{
    
    private Integer codigoActividad;
    private Date dateInicio;
    private Date dateFin;
    private String descripcion;
    private Integer codigoAgenda;
}
