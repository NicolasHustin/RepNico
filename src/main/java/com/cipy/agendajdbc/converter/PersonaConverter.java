
package com.cipy.agendajdbc.converter;

import com.cipy.agendajdbc.dto.PersonaDTO;
import com.cipy.agendajdbc.model.response.PersonaResponse;
import com.cipy.agendajdbc.model.request.PersonaRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonaConverter {
    
    public PersonaResponse buildModel(PersonaDTO dto){
        PersonaResponse persona = new PersonaResponse();
        persona.setCodigoPersona(dto.getCodigoPersona());
        persona.setNombre(dto.getNombre());
        persona.setApellido(dto.getApellido());
        return persona;
    }
    
   public PersonaDTO buildDTO(PersonaRequest personaRequest){
       PersonaDTO persona = new PersonaDTO();
       
       persona.setCodigoPersona(personaRequest.getCodigoPersona());
       persona.setNombre(personaRequest.getNombre());
       persona.setApellido(personaRequest.getApellido());
       
       return persona;
   }
   
   public List<PersonaResponse> buildModels(List<PersonaDTO> dtos){
       List<PersonaResponse> personas = new ArrayList<>();
       
       for (PersonaDTO dto : dtos) {
           personas.add(buildModel(dto));
       }
       return personas;
   }
   
}
