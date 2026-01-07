package com.elsonreis.EspacoPragmatico.controller;

import ch.qos.logback.core.read.ListAppender;
import com.elsonreis.EspacoPragmatico.model.Horario;
import com.elsonreis.EspacoPragmatico.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/horarios")
@CrossOrigin
public class HorarioController {

    @Autowired
    private HorarioService service;

    @GetMapping("/disponiveis")
    public List<Horario> listarHorariosDisponiveis() {
        return service.listarDisponiveis();
    }
}
