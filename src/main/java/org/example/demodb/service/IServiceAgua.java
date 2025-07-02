package org.example.demodb.service;

import org.example.demodb.model.RegistroAgua;
import java.util.List;

public interface IServiceAgua {
    RegistroAgua save(RegistroAgua agua);
    RegistroAgua update(RegistroAgua agua);
    void delete(Integer id);
    RegistroAgua findOne(Integer id);
    List<RegistroAgua> getAll();
}
