package com.elsonreis.EspacoPragmatico.service;

import com.elsonreis.EspacoPragmatico.model.Aluno;
import com.elsonreis.EspacoPragmatico.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> list() {
        return repository.findAll();
    }
}
