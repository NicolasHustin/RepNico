
package com.cipy.agendajdbc.model.request;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaRequest implements Serializable{
    
    private Integer codigoAgenda;
    private Date fecha;
    private Integer codigoPersona;
}
