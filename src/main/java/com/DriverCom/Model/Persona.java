package com.DriverCom.Model;

import jakarta.persistence.*;
import lombok.Data;
// Se crea la entidad
@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
//    private tipoDoc tipoDoc;
//    private String numDoc;
//    private String correo;
//    private String direccion;
//    private String telefono;
    private String usuario;
    private String contrasena;
//    private String estado;

//    public enum tipoDoc {
//        C_c, T_i, Pasaporte, Otro
//    }
}
