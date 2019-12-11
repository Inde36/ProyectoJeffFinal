package com.projectefinal.proyectojeff.controllers;

import com.projectefinal.proyectojeff.models.Paciente;
import com.projectefinal.proyectojeff.models.PacienteSimplificado;
import com.projectefinal.proyectojeff.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping("/lista")

    public List<Paciente> listar(){
        System.out.println("PETICION DE LISTADO DE PACIENTES");
        return pacienteRepository.findAll();
    }


    @CrossOrigin(origins = "http://localhost")
    @GetMapping("/pacienteSolo")
    public List<PacienteSimplificado> listarSolo(){
        System.out.println("PETICION DE SOLO LISTADO DE CLIENTES");
        return pacienteRepository.findPacienteSimplificado();
    }



    @GetMapping("/pacienteId/{id}")
    public Paciente pacienteSolo(@PathVariable String id ){
         return pacienteRepository.findById(Long.parseLong(id)).orElse(null);
    }


    @PostMapping("/add")
    public List<Paciente> add(@RequestBody Paciente paciente) {
        System.out.println(paciente);
        pacienteRepository.save(paciente);
        return pacienteRepository.findAll();

    }


    @DeleteMapping("/delete/{id}")
    public List<Paciente> delete(@PathVariable String id) {

        pacienteRepository.deleteById(Long.parseLong(id));
        return pacienteRepository.findAll();

    }

    @PutMapping("/update/{id}")
    public List<Paciente> update(@PathVariable String id , @RequestBody Paciente paciente) {

        paciente.setId(Long.parseLong( id));
        pacienteRepository.save(paciente);
        return pacienteRepository.findAll();

    }


}
