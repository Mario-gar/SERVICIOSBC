package org.example.demodb.service;

import org.example.demodb.model.EjercicioRealizado;

import java.util.List;

public interface IServiceEjercicioRealizado {
    EjercicioRealizado save(EjercicioRealizado ejercicio);
    EjercicioRealizado update(EjercicioRealizado ejercicio);
    void delete(Integer id);
    EjercicioRealizado findOne(Integer id);
    List<EjercicioRealizado> getAll();
}
