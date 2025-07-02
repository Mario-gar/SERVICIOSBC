package org.example.demodb.controller;

import jakarta.validation.Valid;
import org.example.demodb.dto.RegistroCaloriasDTO;
import org.example.demodb.model.RegistroCalorias;
import org.example.demodb.service.IServiceRegistroCalorias;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calorias")
public class RegistroCaloriasController {

    @Autowired
    private IServiceRegistroCalorias service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public List<RegistroCaloriasDTO> getAll() {
        return service.getAll().stream()
                .map(reg -> modelMapper.map(reg, RegistroCaloriasDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/save")
    public RegistroCaloriasDTO save(@RequestBody @Valid RegistroCaloriasDTO dto) {
        RegistroCalorias entity = modelMapper.map(dto, RegistroCalorias.class);
        return modelMapper.map(service.save(entity), RegistroCaloriasDTO.class);
    }

    @GetMapping("/{id}")
    public RegistroCaloriasDTO get(@PathVariable Integer id) {
        return modelMapper.map(service.findOne(id), RegistroCaloriasDTO.class);
    }

    @PutMapping("/update")
    public RegistroCaloriasDTO update(@RequestBody RegistroCaloriasDTO dto) {
        RegistroCalorias entity = modelMapper.map(dto, RegistroCalorias.class);
        return modelMapper.map(service.update(entity), RegistroCaloriasDTO.class);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

