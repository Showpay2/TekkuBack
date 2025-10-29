package com.tekku.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class HorasExtraDTO {

    @NotNull(message = "La fecha es obligatoria")
    private LocalDate fecha;

    @Min(value = 1, message = "Debe haber al menos 1 hora extra")
    private int cantidadHoras;

    private boolean aprobado = false; // por defecto no aprobado

    @NotNull(message = "Debe asignarse a un usuario")
    private Long usuarioId;
}