package com.elsonreis.EspacoPragmatico.repository;

import com.elsonreis.EspacoPragmatico.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {}
