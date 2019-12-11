package com.projectefinal.proyectojeff.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String telefono;

    @JsonManagedReference
    @JsonProperty("trabajos")
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "paciente")
    private List<Trabajo> operaciones;



    public Paciente() {
        operaciones=new ArrayList<Trabajo>();
    }

    public List<Trabajo> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<Trabajo> operaciones) {
        this.operaciones = operaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String toString(){
        return "[id] "+id+" [nombre] " + nombre ;
    }

}
