package com.cipy.agendajdbc.model.response;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActividadResponse implements Serializable{

    private Integer codigoActividad;
    private Date dateInicio;
    private Date dateFin;
    private String descripcion;
    private Integer codigoAgenda;
}
