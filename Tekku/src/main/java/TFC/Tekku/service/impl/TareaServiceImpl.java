package com.tekku.service.impl;

import com.tekku.model.Tarea;
import com.tekku.repository.TareaRepository;
import com.tekku.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public List<Tarea> listar() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea guardar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea guardarPorJefeEquipo(Tarea tarea, Long jefeId) {
        Usuario jefe = usuarioRepo.findById(jefeId).orElseThrow();
        Usuario peon = tarea.getAsignadoA();

        if (jefe.getRol() != Usuario.Rol.JEFE_EQUIPO) {
            throw new RuntimeException("Solo los jefes de equipo pueden usar esta función.");
        }

        if (!jefe.getCampo().equals(peon.getCampo())) {
            throw new RuntimeException("El peón no pertenece al mismo campo que el jefe de equipo.");
        }

        return tareaRepo.save(tarea);
    }
}