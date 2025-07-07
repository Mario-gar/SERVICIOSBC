package org.example.demodb.dto;

import lombok.Data;
import org.example.demodb.model.TipoPersona;

@Data
public class RegisterRequest {
    private String email;
    private String contrasena;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private TipoPersona tipoPersona;
}
