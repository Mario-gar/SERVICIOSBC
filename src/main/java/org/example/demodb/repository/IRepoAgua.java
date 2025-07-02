package org.example.demodb.repository;

import org.example.demodb.model.RegistroAgua;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoAgua extends JpaRepository<RegistroAgua, Integer> {
}
