package com.elsonreis.EspacoPragmatico.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diaSemana;
    private String horaSemana;
    private String horaFim;
    private boolean disponivel;
}
