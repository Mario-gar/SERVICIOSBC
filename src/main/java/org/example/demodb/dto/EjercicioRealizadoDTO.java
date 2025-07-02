package org.example.demodb.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EjercicioRealizadoDTO {
    private Integer id;
    private String tipo;
    private int duracionMinutos;
    private int caloriasQuemadas;
    private LocalDate fecha;
    private Integer usuarioId;
}

