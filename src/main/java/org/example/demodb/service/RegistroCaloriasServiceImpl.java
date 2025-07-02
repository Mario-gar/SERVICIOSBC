package org.example.demodb.service;

import org.example.demodb.model.RegistroCalorias;
import org.example.demodb.repository.IRegistroCaloriasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroCaloriasServiceImpl implements IServiceRegistroCalorias {

    @Autowired
    private IRegistroCaloriasRepo repo;

    @Override
    public List<RegistroCalorias> getAll() {
        return repo.findAll();
    }

    @Override
    public RegistroCalorias findOne(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public RegistroCalorias save(RegistroCalorias registro) {
        return repo.save(registro);
    }

    @Override
    public RegistroCalorias update(RegistroCalorias registro) {
        return repo.save(registro);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}