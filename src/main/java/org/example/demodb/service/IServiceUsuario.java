package org.example.demodb.service;

import org.example.demodb.exception.UsuarioException;
import org.example.demodb.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceUsuario {

    public List<Usuario> getAll();

    public Usuario save(Usuario usuario);

    public void delete(Integer id);

    public Usuario update(Usuario usuario);

    public Usuario findOne(Integer id) throws UsuarioException;
}
