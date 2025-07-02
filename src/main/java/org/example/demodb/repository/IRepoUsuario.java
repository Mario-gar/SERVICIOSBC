package org.example.demodb.repository;

import org.example.demodb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepoUsuario extends JpaRepository<Usuario, Integer>
{
    Optional<Usuario> findByEmail(String email);
}