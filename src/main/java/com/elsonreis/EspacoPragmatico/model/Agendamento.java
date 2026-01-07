package com.elsonreis.EspacoPragmatico.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAluno;

    @ManyToOne
    @JoinColumn(name = "horario_id")
    private Horario horario;
}
