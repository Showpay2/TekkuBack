package com.tekku.controller;

import com.tekku.model.AsignacionMaquina;
import com.tekku.service.AsignacionMaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/asignaciones")
public class AsignacionMaquinaController {

    @Autowired
    private AsignacionMaquinaService asignacionService;

    @PostMapping
    public AsignacionMaquina asignar(@RequestParam Long peonId, @RequestParam Long maquinaId) {
        return asignacionService.asignarMaquina(peonId, maquinaId);
    }
}