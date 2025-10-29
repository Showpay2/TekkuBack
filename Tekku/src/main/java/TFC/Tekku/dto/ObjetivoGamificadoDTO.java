package com.tekku.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ObjetivoGamificadoDTO {

    @NotBlank(message = "La descripción del objetivo es obligatoria")
    private String descripcion;

    @Min(value = 1, message = "Debe asignarse al menos 1 punto")
    private int puntos;

    // Getters y Setters
}