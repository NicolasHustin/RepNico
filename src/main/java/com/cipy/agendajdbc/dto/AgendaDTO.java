
package com.cipy.agendajdbc.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaDTO implements Serializable {
    
    private Integer codigoAgenda;
    private Date fecha;
    private Integer codigoPersona;
}
