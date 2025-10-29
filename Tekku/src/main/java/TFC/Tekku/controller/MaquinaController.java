package com.tekku.controller;

import com.tekku.model.Maquina;
import com.tekku.service.MaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maquinas")
public class MaquinaController {

    @Autowired
    private MaquinaService maquinaService;

    @GetMapping
    public List<Maquina> listar() {
        return maquinaService.listar();
    }

    @PostMapping
    public Maquina crear(@RequestBody Maquina maquina) {
        return maquinaService.guardar(maquina);
    }
}