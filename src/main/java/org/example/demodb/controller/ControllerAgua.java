package org.example.demodb.controller;


import org.example.demodb.model.RegistroAgua;
import org.example.demodb.service.IServiceAgua;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agua")
public class ControllerAgua {

    @Autowired
    private IServiceAgua serviceAgua;

    @GetMapping("/all")
    public List<RegistroAgua> getAll() {
        return serviceAgua.getAll();
    }

    @GetMapping("/{id}")
    public RegistroAgua get(@PathVariable Integer id) {
        return serviceAgua.findOne(id);
    }

    @PostMapping("/save")
    public RegistroAgua save(@RequestBody RegistroAgua agua) {
        return serviceAgua.save(agua);
    }

    @PutMapping("/update")
    public RegistroAgua update(@RequestBody RegistroAgua agua) {
        return serviceAgua.update(agua);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        serviceAgua.delete(id);
    }
}
