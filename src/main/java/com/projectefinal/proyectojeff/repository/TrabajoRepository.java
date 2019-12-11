package com.projectefinal.proyectojeff.repository;

import com.projectefinal.proyectojeff.models.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrabajoRepository extends JpaRepository<Trabajo,Long> {


}
