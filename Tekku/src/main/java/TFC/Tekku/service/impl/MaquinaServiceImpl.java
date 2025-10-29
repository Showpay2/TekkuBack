package com.tekku.service.impl;

import com.tekku.model.Maquina;
import com.tekku.repository.MaquinaRepository;
import com.tekku.service.MaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaquinaServiceImpl implements MaquinaService {

    @Autowired
    private MaquinaRepository maquinaRepo;

    @Override
    public List<Maquina> listar() {
        return maquinaRepo.findAll();
    }

    @Override
    public Maquina guardar(Maquina maquina) {
        return maquinaRepo.save(maquina);
    }
}