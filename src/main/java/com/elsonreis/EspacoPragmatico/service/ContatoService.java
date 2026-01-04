package com.elsonreis.EspacoPragmatico.service;

import com.elsonreis.EspacoPragmatico.model.Agendamento;
import com.elsonreis.EspacoPragmatico.model.Contato;
import com.elsonreis.EspacoPragmatico.repository.AgendamentoRepository;
import com.elsonreis.EspacoPragmatico.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato salvar(Contato contato){
        return repository.save(contato);
    }
}
