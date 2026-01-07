package com.elsonreis.EspacoPragmatico.service;

import com.elsonreis.EspacoPragmatico.model.Horario;
import com.elsonreis.EspacoPragmatico.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository repository;

    public void criarHorariosPadrao() {

        String[] dias = {
                "SEGUNDA", "TERCA", "QUARTA", "QUINTA", "SEXTA"
        };

        for (String dia : dias) {
            for (int hora = 8; hora < 18; hora++) {

                Horario horario = new Horario();
                horario.setDiaSemana(dia);
                horario.setHoraInicio(hora + ":00");
                horario.setHoraFim(hora + 1 + ":00");
                horario.setDisponivel(true);

                repository.save(horario);
            }
        }
    }

    public List<Horario> listarDisponiveis() {
        return repository.findByDisponivelTrue();
    }

    public void marcarIndisponivel(Horario horario) {
        horario.setDisponivel(false);
        repository.save(horario);
    }
}
