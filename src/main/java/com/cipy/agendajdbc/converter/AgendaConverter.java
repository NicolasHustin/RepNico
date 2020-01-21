
package com.cipy.agendajdbc.converter;

import com.cipy.agendajdbc.dto.AgendaDTO;
import com.cipy.agendajdbc.model.response.AgendaResponse;
import com.cipy.agendajdbc.model.request.AgendaRequest;
import org.springframework.stereotype.Component;

@Component
public class AgendaConverter {
    
    public AgendaResponse buildModel(AgendaDTO dto){
        AgendaResponse agenda = new AgendaResponse();
        agenda.setCodigoAgenda(dto.getCodigoAgenda());
        agenda.setFecha(dto.getFecha());
        return agenda;
    }
    
    public AgendaDTO buildDTO(AgendaRequest ar){
        AgendaDTO agenda = new AgendaDTO();
        agenda.setCodigoAgenda(ar.getCodigoAgenda());
        agenda.setCodigoPersona(ar.getCodigoPersona());
        agenda.setFecha(ar.getFecha());
        return agenda;
    }
    
}
