package org.example.demodb.service;


import org.example.demodb.model.RegistroAgua;
import org.example.demodb.repository.IRepoAgua;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAgua implements IServiceAgua {

    @Autowired
    private IRepoAgua repoAgua;

    @Override
    public RegistroAgua save(RegistroAgua agua) {
        return repoAgua.save(agua);
    }

    @Override
    public RegistroAgua update(RegistroAgua agua) {
        return repoAgua.save(agua);
    }

    @Override
    public void delete(Integer id) {
        repoAgua.deleteById(id);
    }

    @Override
    public RegistroAgua findOne(Integer id) {
        return repoAgua.findById(id).orElse(null);
    }

    @Override
    public List<RegistroAgua> getAll() {
        return repoAgua.findAll();
    }
}
