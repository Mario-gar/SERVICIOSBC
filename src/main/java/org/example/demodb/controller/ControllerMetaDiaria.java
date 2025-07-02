package org.example.demodb.controller;

import org.example.demodb.model.MetaDiaria;
import org.example.demodb.service.IServiceMetaDiaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meta")
public class ControllerMetaDiaria {

    @Autowired
    private IServiceMetaDiaria serviceMeta;

    @GetMapping("/all")
    public List<MetaDiaria> getAll() {
        return serviceMeta.getAll();
    }

    @GetMapping("/{id}")
    public MetaDiaria get(@PathVariable Integer id) {
        return serviceMeta.findOne(id);
    }

    @PostMapping("/save")
    public MetaDiaria save(@RequestBody MetaDiaria meta) {
        return serviceMeta.save(meta);
    }

    @PutMapping("/update")
    public MetaDiaria update(@RequestBody MetaDiaria meta) {
        return serviceMeta.update(meta);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        serviceMeta.delete(id);
    }
}
