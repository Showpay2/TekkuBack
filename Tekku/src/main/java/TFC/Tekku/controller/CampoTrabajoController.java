package com.tekku.controller;

import com.tekku.model.CampoTrabajo;
import com.tekku.service.CampoTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campos")
public class CampoTrabajoController {

    @Autowired
    private CampoTrabajoService campoService;

    @GetMapping
    public List<CampoTrabajo> listar() {
        return campoService.listar();
    }

    @PostMapping
    public CampoTrabajo crear(@RequestBody CampoTrabajo campo) {
        return campoService.guardar(campo);
    }
}