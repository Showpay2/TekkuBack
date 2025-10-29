package com.tekku.controller;

import com.tekku.model.HorasExtra;
import com.tekku.service.HorasExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horas-extra")
public class HorasExtraController {

    @Autowired
    private HorasExtraService horasExtraService;

    @GetMapping
    public List<HorasExtra> listar() {
        return horasExtraService.listar();
    }

    @PostMapping
    public HorasExtra crear(@RequestBody HorasExtra horasExtra) {
        return horasExtraService.guardar(horasExtra);
    }
}