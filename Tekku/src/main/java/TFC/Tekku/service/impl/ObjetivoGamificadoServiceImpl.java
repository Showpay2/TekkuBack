package com.tekku.service.impl;

import com.tekku.model.ObjetivoGamificado;
import com.tekku.repository.ObjetivoGamificadoRepository;
import com.tekku.service.ObjetivoGamificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetivoGamificadoServiceImpl implements ObjetivoGamificadoService {

    @Autowired
    private ObjetivoGamificadoRepository objetivoRepository;

    @Override
    public List<ObjetivoGamificado> listar() {
        return objetivoRepository.findAll();
    }

    @Override
    public ObjetivoGamificado guardar(ObjetivoGamificado objetivo) {
        return objetivoRepository.save(objetivo);
    }
}