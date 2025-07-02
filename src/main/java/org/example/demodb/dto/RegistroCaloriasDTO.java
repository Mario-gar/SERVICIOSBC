package org.example.demodb.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegistroCaloriasDTO {
    private Integer id;

    @NotBlank(message = "La descripción no puede estar vacía")
    private String descripcion;

    @NotNull(message = "Debe especificar las calorías")
    @Min(value = 1, message = "Las calorías deben ser mayores a 0")
    private Integer calorias;

    @NotNull(message = "Debe ingresar la fecha del registro")
    private LocalDate fecha;
}
