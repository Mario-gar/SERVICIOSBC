package org.example.demodb.model;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EdadValidator implements ConstraintValidator<EdadSegunTipo, Usuario> {

    @Override
    public boolean isValid(Usuario usuario, ConstraintValidatorContext context) {
        if (usuario.getTipoPersona() == null) return true;

        int edad = usuario.getEdad();
        boolean esValido = switch (usuario.getTipoPersona()) {
            case MENOR_EDAD -> edad >= 1 && edad <= 17;
            case ADULTO -> edad > 17;
        };

        if (!esValido) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Edad inválida para el tipo: " + usuario.getTipoPersona())
                    .addPropertyNode("edad")
                    .addConstraintViolation();
        }

        return esValido;
    }
}
