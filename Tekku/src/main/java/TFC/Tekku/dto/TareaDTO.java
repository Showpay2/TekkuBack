package com.tekku.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TareaDTO {

    @NotBlank(message = "El nombre de la tarea es obligatorio")
    private String nombre;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    @NotNull(message = "La dificultad física es obligatoria")
    private String dificultadFisica; // BAJA, MEDIA, ALTA

    @NotNull(message = "El estado de la tarea es obligatorio")
    private String estado; // PENDIENTE, EN_PROGRESO, COMPLETADA

    @NotNull(message = "Debe asignarse a un peón")
    private Long asignadoAId;

    // Getters y Setters
}