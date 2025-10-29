package com.tekku.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MaquinaDTO {

    @NotBlank(message = "El nombre de la máquina es obligatorio")
    private String nombre;

    @NotNull(message = "La dificultad física es obligatoria")
    private String dificultadFisica; // BAJA, MEDIA, ALTA

    // Getters y Setters
}