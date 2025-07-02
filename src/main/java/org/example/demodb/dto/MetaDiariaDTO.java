package org.example.demodb.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MetaDiariaDTO {
    private Integer id;
    private LocalDate fecha;
    private int metaCalorias;
    private int metaAguaMl;
    private int metaEjercicioMinutos;
    private Integer usuarioId;
}
