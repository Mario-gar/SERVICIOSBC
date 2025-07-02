package org.example.demodb.service;

import org.example.demodb.model.EjercicioRealizado;
import org.example.demodb.repository.IRepoEjercicioRealizado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEjercicioRealizado implements IServiceEjercicioRealizado {

    @Autowired
    private IRepoEjercicioRealizado repo;

    @Override
    public EjercicioRealizado save(EjercicioRealizado ejercicio) {
        return repo.save(ejercicio);
    }

    @Override
    public EjercicioRealizado update(EjercicioRealizado ejercicio) {
        return repo.save(ejercicio);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public EjercicioRealizado findOne(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<EjercicioRealizado> getAll() {
        return repo.findAll();
    }
}
