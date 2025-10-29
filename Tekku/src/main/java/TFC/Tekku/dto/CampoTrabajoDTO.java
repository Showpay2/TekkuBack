package com.tekku.dto;

import jakarta.validation.constraints.NotBlank;

public class CampoTrabajoDTO {

    @NotBlank(message = "El nombre del campo de trabajo es obligatorio")
    private String nombre;

    // Getters y Setters
}