package com.tekku.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class TurnoDTO {

    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDateTime fechaInicio;

    @NotNull(message = "La fecha de fin es obligatoria")
    private LocalDateTime fechaFin;

    @NotNull(message = "El tipo de turno es obligatorio")
    private String tipoTurno; // MAÑANA, TARDE, NOCHE

    @NotNull(message = "Debe asignarse a un peón")
    private Long usuarioId;

    // Getters y Setters
}