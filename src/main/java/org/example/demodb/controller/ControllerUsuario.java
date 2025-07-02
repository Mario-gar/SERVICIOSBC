package org.example.demodb.controller;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import org.example.demodb.dto.UsuarioDTO;
import org.example.demodb.exception.UsuarioException;
import org.example.demodb.model.Usuario;
import org.example.demodb.service.IServiceUsuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public List<UsuarioDTO> getAll() {
        return serviceUsuario.getAll().stream()
                .map(usuario -> modelMapper.map(usuario,UsuarioDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsuarioDTO get(@PathVariable(value="id") Integer id) throws UsuarioException {
        return modelMapper.map(serviceUsuario.findOne(id),UsuarioDTO.class);
    }

    @PostMapping("/save")
    public UsuarioDTO save(@RequestBody @Valid UsuarioDTO usuarioDTO) throws UsuarioException {
        Usuario usuarioDB = modelMapper.map(usuarioDTO, Usuario.class);
        usuarioDB.setId(null);
        Set<ConstraintViolation<Usuario>> violations = Validation.buildDefaultValidatorFactory()
                .getValidator().validate(usuarioDB);

        if (!violations.isEmpty()) {
            String errorMsg = violations.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.joining(", "));
            throw new UsuarioException(errorMsg);
        }

        Usuario usuario = serviceUsuario.save(usuarioDB);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    @PutMapping("/update")
    public Usuario update(@RequestBody Usuario usuario) {
        return serviceUsuario.update(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        serviceUsuario.delete(id);
    }

}
