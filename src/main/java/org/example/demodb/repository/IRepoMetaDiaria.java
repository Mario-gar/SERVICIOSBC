package org.example.demodb.repository;

import org.example.demodb.model.MetaDiaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoMetaDiaria extends JpaRepository<MetaDiaria, Integer> {
}
