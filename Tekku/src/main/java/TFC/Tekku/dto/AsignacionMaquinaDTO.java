package com.tekku.dto;

import jakarta.validation.constraints.NotNull;

public class AsignacionMaquinaDTO {

    @NotNull(message = "Debe especificarse el ID del peón")
    private Long peonId;

    @NotNull(message = "Debe especificarse el ID de la máquina")
    private Long maquinaId;


}