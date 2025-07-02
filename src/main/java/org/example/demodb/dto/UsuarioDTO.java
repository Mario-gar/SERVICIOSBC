package org.example.demodb.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.demodb.model.TipoPersona;

@Data
public class UsuarioDTO {
    private Integer id;

    @NotBlank(message = "El primero nombre es obligatorio")
    private String primerNombre;

    @NotBlank(message = "El segundo nombre es obligatorio")
    private String segundoNombre;

    @NotBlank(message = "El primer apellido es obligatorio")
    private String primerApellido;

    @NotBlank(message = "El segundo apellido es obligatorio")
    private String segundoApellido;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 1, message = "La edad debe ser mayor a 0")
    private Integer edad;

    @NotNull(message = "Ingrese si es ADULTO o MENOR_EDAD")
    private TipoPersona tipoPersona;
}
