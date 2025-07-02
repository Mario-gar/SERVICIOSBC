package org.example.demodb.controller;

import org.example.demodb.model.EjercicioRealizado;
import org.example.demodb.service.IServiceEjercicioRealizado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ejercicio")
public class ControllerEjercicioRealizado {

    @Autowired
    private IServiceEjercicioRealizado service;

    @GetMapping("/all")
    public List<EjercicioRealizado> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EjercicioRealizado get(@PathVariable Integer id) {
        return service.findOne(id);
    }

    @PostMapping("/save")
    public EjercicioRealizado save(@RequestBody EjercicioRealizado ejercicio) {
        return service.save(ejercicio);
    }

    @PutMapping("/update")
    public EjercicioRealizado update(@RequestBody EjercicioRealizado ejercicio) {
        return service.update(ejercicio);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
