package org.example.demodb.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RegistroAguaDTO {
    private Integer id;
    private LocalDate fecha;
    private int cantidadMililitros;
    private Integer usuarioId;
}
