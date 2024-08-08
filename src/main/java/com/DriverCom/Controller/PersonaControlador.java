package com.DriverCom.Controller;

import com.DriverCom.Model.Persona;
import com.DriverCom.Servicio.PersonaDTO;
import com.DriverCom.Servicio.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Y por ultimo se crean los controladores para el navegador 



@RestController
public class PersonaControlador {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona(){
        return personaService.listadoDePersonas();
    }
    
    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }
    
    @DeleteMapping("/persona/{idPersona}")
    @ResponseBody
    public void borrarPersona(@PathVariable Long idPersona){
        personaService.borrarPersona(idPersona);
    }
    
    @GetMapping("/persona/{idPersona}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long idPersona){
        return personaService.buscarPersonaPorID(idPersona);
    }
    
    @PutMapping("/persona")
    @ResponseBody
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }
    
    @PostMapping("/login")
    public PersonaDTO login(@RequestBody Persona persona){
       return personaService.login(persona.getUsuario(), persona.getContrasena());
    }
}
