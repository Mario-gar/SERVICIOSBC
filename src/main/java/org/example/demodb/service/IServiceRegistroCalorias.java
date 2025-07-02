package org.example.demodb.service;


import org.example.demodb.model.RegistroCalorias;

import java.util.List;

public interface IServiceRegistroCalorias {
    List<RegistroCalorias> getAll();
    RegistroCalorias findOne(Integer id);
    RegistroCalorias save(RegistroCalorias registro);
    RegistroCalorias update(RegistroCalorias registro);
    void delete(Integer id);
}
