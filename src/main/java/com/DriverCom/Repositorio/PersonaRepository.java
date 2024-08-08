package com.DriverCom.Repositorio;

import com.DriverCom.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Se Crea el repositorio y se extiende de jpa para los metodos del Crud
// tambien se mapea

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
    public Persona findByUsuarioAndContrasena(String usuario, String contrasena);
}
