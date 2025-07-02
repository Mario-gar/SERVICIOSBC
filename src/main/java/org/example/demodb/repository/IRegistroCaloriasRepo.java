package org.example.demodb.repository;

import org.example.demodb.model.RegistroCalorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroCaloriasRepo extends JpaRepository<RegistroCalorias, Integer> {
}
