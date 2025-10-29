package com.tekku.service.impl;

import com.tekku.model.*;
import com.tekku.repository.*;
import com.tekku.service.AsignacionMaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionMaquinaServiceImpl implements AsignacionMaquinaService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private MaquinaRepository maquinaRepo;

    @Autowired
    private AsignacionMaquinaRepository asignacionRepo;

    @Override
    public AsignacionMaquina asignarMaquina(Long peonId, Long maquinaId) {
        Usuario peon = usuarioRepo.findById(peonId).orElseThrow();
        Maquina maquina = maquinaRepo.findById(maquinaId).orElseThrow();

        if (peon.getRol() != Usuario.Rol.PEON) {
            throw new RuntimeException("Solo se pueden asignar máquinas a peones.");
        }

        if (maquina.getDificultad().ordinal() > peon.getNivelFisico().ordinal()) {
            throw new RuntimeException("La dificultad de la máquina excede el nivel físico del peón.");
        }

        AsignacionMaquina asignacion = new AsignacionMaquina();
        asignacion.setPeon(peon);
        asignacion.setMaquina(maquina);
        return asignacionRepo.save(asignacion);
    }
}