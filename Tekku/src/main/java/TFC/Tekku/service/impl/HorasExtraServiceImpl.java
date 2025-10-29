package com.tekku.service.impl;

import com.tekku.model.HorasExtra;
import com.tekku.repository.HorasExtraRepository;
import com.tekku.service.HorasExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorasExtraServiceImpl implements HorasExtraService {

    @Autowired
    private HorasExtraRepository horasExtraRepository;

    @Override
    public List<HorasExtra> listar() {
        return horasExtraRepository.findAll();
    }

    @Override
    public HorasExtra guardar(HorasExtra horasExtra) {
        return horasExtraRepository.save(horasExtra);
    }
}