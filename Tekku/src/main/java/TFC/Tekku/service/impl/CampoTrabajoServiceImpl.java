package com.tekku.service.impl;

import com.tekku.model.CampoTrabajo;
import com.tekku.repository.CampoTrabajoRepository;
import com.tekku.service.CampoTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampoTrabajoServiceImpl implements CampoTrabajoService {

    @Autowired
    private CampoTrabajoRepository campoRepo;

    @Override
    public List<CampoTrabajo> listar() {
        return campoRepo.findAll();
    }

    @Override
    public CampoTrabajo guardar(CampoTrabajo campo) {
        return campoRepo.save(campo);
    }
}