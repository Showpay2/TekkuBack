package com.tekku.service.impl;

import com.tekku.model.Turno;
import com.tekku.repository.TurnoRepository;
import com.tekku.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;

    @Override
    public List<Turno> listar() {
        return turnoRepository.findAll();
    }

    @Override
    public Turno guardar(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public Turno crearTurnoPorJefeEquipo(Turno turno, Long jefeId) {
        Usuario jefe = usuarioRepo.findById(jefeId).orElseThrow();
        Usuario peon = turno.getUsuario();

        if (jefe.getRol() != Usuario.Rol.JEFE_EQUIPO) {
            throw new RuntimeException("Solo los jefes de equipo pueden usar esta función.");
        }

        if (!jefe.getCampo().equals(peon.getCampo())) {
            throw new RuntimeException("El peón no pertenece al mismo campo que el jefe de equipo.");
        }

        return turnoRepo.save(turno);
    }
}