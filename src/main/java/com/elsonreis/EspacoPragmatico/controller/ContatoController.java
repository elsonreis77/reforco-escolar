package com.elsonreis.EspacoPragmatico.controller;

import com.elsonreis.EspacoPragmatico.model.Contato;
import com.elsonreis.EspacoPragmatico.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
@CrossOrigin
public class ContatoController {

    @Autowired
    private ContatoService service;

    @RequestMapping
    public Contato salvar(@RequestBody Contato contato) {
        return service.salvar(contato);
    }
}
