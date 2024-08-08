package com.DriverCom.Servicio;

import com.DriverCom.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DriverCom.Repositorio.PersonaRepository;
import java.util.List;

// Se Crea la capa de servicio y se mapea y se le inyecta la capa de Repository
//agregarndo los metodos que necesitemos 
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    public Persona crearPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public Persona modificarPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public void borrarPersona(Long idPersona) {
        personaRepo.deleteById(idPersona);
    }

    public List<Persona> listadoDePersonas() {
        return personaRepo.findAll();
    }

    public Persona buscarPersonaPorID(Long idPersona) {
        return personaRepo.findById(idPersona).orElse(null);
    }

    public PersonaDTO login(String usuario, String contrasena) {
        Persona persona = personaRepo.findByUsuarioAndContrasena(usuario, contrasena);
        PersonaDTO personaDTO = new PersonaDTO(persona.getIdPersona(), persona.getNombre(), persona.getApellido());
        return personaDTO;
    }

}
