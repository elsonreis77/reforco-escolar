package com.elsonreis.EspacoPragmatico.repository;

import com.elsonreis.EspacoPragmatico.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
    List<Horario> findByDisponivelTrue();
}
