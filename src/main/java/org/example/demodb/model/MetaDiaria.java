package org.example.demodb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class MetaDiaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;

    private int metaCalorias;

    private int metaAguaMl;

    private int metaEjercicioMinutos;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}

