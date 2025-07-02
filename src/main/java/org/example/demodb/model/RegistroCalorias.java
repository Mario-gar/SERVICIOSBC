package org.example.demodb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class RegistroCalorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "La descripción no puede estar vacía")
    private String descripcion;

    @NotNull(message = "Debe especificar la cantidad de calorías")
    @Min(value = 1, message = "Las calorías deben ser mayores a 0")
    private Integer calorias;

    @NotNull(message = "Debe indicar la fecha del registro")
    private LocalDate fecha;

     private Integer usuarioId;
}
