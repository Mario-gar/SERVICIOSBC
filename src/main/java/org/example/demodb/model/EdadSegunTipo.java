package org.example.demodb.model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EdadValidator.class)
@Documented
public @interface EdadSegunTipo {
    String message() default "La edad no coincide con el tipo de persona.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}