package com.projectefinal.proyectojeff.repository;

import com.projectefinal.proyectojeff.models.Paciente;
import com.projectefinal.proyectojeff.models.PacienteSimplificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {

    @Query("SELECT c FROM Paciente c")
    List<PacienteSimplificado> findPacienteSimplificado();
}
