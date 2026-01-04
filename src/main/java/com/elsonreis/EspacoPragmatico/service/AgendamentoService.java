package com.elsonreis.EspacoPragmatico.service;

import com.elsonreis.EspacoPragmatico.model.Agendamento;
import com.elsonreis.EspacoPragmatico.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamento salvar(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    public List<Agendamento> listar() {
        return repository.findAll();
    }
}
