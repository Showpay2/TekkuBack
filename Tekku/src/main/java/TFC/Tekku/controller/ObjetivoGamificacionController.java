package com.tekku.controller;

import com.tekku.model.ObjetivoGamificado;
import com.tekku.service.ObjetivoGamificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/objetivos")
public class ObjetivoGamificadoController {

    @Autowired
    private ObjetivoGamificadoService objetivoService;

    @GetMapping
    public List<ObjetivoGamificado> listar() {
        return objetivoService.listar();
    }

    @PostMapping
    public ObjetivoGamificado crear(@RequestBody ObjetivoGamificado objetivo) {
        return objetivoService.guardar(objetivo);
    }
}