package TFC.tekku.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NotificacionDTO {

    @NotBlank(message = "El mensaje no puede estar vacío")
    private String mensaje;

    @NotNull(message = "Debe especificarse el ID del receptor")
    private Long receptorId;

    @NotNull(message = "Debe especificarse el ID del emisor")
    private Long emisorId;

    // Getters y Setters
}