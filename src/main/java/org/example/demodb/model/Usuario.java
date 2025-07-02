package org.example.demodb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@EdadSegunTipo
@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private String email;

    private String contrasena;

    @Enumerated(EnumType.STRING)
    private TipoPersona tipoPersona;

    private int edad;
}
