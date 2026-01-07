package com.elsonreis.EspacoPragmatico.config;

import com.elsonreis.EspacoPragmatico.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private HorarioService horarioService;

    @Override
    public void run(String... args) {
        horarioService.criarHorariosPadrao();
    }
}
