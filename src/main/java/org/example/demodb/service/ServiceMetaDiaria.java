package org.example.demodb.service;

import org.example.demodb.model.MetaDiaria;
import org.example.demodb.repository.IRepoMetaDiaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMetaDiaria implements IServiceMetaDiaria {

    @Autowired
    private IRepoMetaDiaria repoMetaDiaria;

    @Override
    public MetaDiaria save(MetaDiaria meta) {
        return repoMetaDiaria.save(meta);
    }

    @Override
    public MetaDiaria update(MetaDiaria meta) {
        return repoMetaDiaria.save(meta);
    }

    @Override
    public void delete(Integer id) {
        repoMetaDiaria.deleteById(id);
    }

    @Override
    public MetaDiaria findOne(Integer id) {
        return repoMetaDiaria.findById(id).orElse(null);
    }

    @Override
    public List<MetaDiaria> getAll() {
        return repoMetaDiaria.findAll();
    }
}
