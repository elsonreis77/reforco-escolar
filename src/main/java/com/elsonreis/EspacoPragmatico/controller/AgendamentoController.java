package com.elsonreis.EspacoPragmatico.controller;


import com.elsonreis.EspacoPragmatico.model.Agendamento;
import com.elsonreis.EspacoPragmatico.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@CrossOrigin
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public Agendamento criar(@RequestBody Agendamento agendamento) {
        return service.salvar(agendamento);
    }

    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }
}
