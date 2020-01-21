package com.cipy.agendajdbc.model.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaResponse implements Serializable{

    private Integer codigoAgenda;
    private Date fecha;
    private PersonaResponse persona;
    private List<ActividadResponse> actividades;
}
