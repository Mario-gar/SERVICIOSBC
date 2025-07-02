package org.example.demodb.repository;

import org.example.demodb.model.EjercicioRealizado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoEjercicioRealizado extends JpaRepository<EjercicioRealizado, Integer> {
}
