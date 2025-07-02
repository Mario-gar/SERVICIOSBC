package org.example.demodb.service;

import org.example.demodb.model.MetaDiaria;

import java.util.List;

public interface IServiceMetaDiaria {
    MetaDiaria save(MetaDiaria meta);
    MetaDiaria update(MetaDiaria meta);
    void delete(Integer id);
    MetaDiaria findOne(Integer id);
    List<MetaDiaria> getAll();
}

