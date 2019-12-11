package com.projectefinal.proyectojeff.controllers;

import com.projectefinal.proyectojeff.models.Trabajo;
import com.projectefinal.proyectojeff.repository.TrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabajo")
public class TrabajoController {


    @Autowired
    TrabajoRepository trabajoRepository;

    @GetMapping("/lista")
    public List<Trabajo> listar(){
        System.out.println("PETICION DE LISTADO DE TRABAJOS");
        return trabajoRepository.findAll();
    }


    @PostMapping("/add")
    public List<Trabajo> add(@RequestBody Trabajo trabajo) {
        System.out.println(trabajo);
        trabajoRepository.save(trabajo);
        return trabajoRepository.findAll();

    }

    @DeleteMapping("/delete/{id}")
    public List<Trabajo> delete(@PathVariable String id) {

        trabajoRepository.deleteById(Long.parseLong(id));
        return trabajoRepository.findAll();

    }

    @PutMapping("/update/{id}")
    public List<Trabajo> update(@PathVariable String id , @RequestBody Trabajo trabajo) {

        trabajo.setId(Long.parseLong( id));
        trabajoRepository.save(trabajo);
        return trabajoRepository.findAll();

    }

}
