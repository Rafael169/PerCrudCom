package com.DriverCom.Servicio;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {

    private Long idPersona;
    private String nombre;
    private String apellido;

    public PersonaDTO() {
    }

    public PersonaDTO(Long idPersona, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
