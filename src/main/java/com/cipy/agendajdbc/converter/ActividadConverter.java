
package com.cipy.agendajdbc.converter;

import com.cipy.agendajdbc.dto.ActividadDTO;
import com.cipy.agendajdbc.model.response.ActividadResponse;
import com.cipy.agendajdbc.model.request.ActividadRequest;
import org.springframework.stereotype.Component;

@Component
public class ActividadConverter {
    
    public ActividadResponse buildModel(ActividadDTO dto){
        
        ActividadResponse actividad = new ActividadResponse();
        actividad.setCodigoActividad(dto.getCodigoActividad());
        actividad.setDateInicio(dto.getDateInicio());
        actividad.setDateFin(dto.getDateFin());
        actividad.setDescripcion(dto.getDescripcion());
        
        return actividad;
    }
    
    public ActividadDTO buildDTO(ActividadRequest actividadRequest){
        ActividadDTO actividad = new ActividadDTO();
        actividad.setCodigoActividad(actividadRequest.getCodigoActividad());
        actividad.setDateInicio(actividadRequest.getDateInicio());
        actividad.setDateFin(actividadRequest.getDateFin());
        actividad.setDescripcion(actividadRequest.getDescripcion());
        
        return actividad;
    }
    
    
}
