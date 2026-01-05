package com.elsonreis.EspacoPragmatico.controller;

import com.elsonreis.EspacoPragmatico.model.Aluno;
import com.elsonreis.EspacoPragmatico.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/alunos")
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno aluno) {
        return service.salvar(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return service.list();
    }
}
