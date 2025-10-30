package com.tekku.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    @Enumerated(EnumType.STRING)
    private TipoTurno tipo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public enum TipoTurno {
        MAÑANA, TARDE, NOCHE
    }

    public Turno convertirDesdeDTO(TurnoDTO dto, Usuario peon) {
        Turno turno = new Turno();
        turno.setFechaInicio(dto.getFechaInicio());
        turno.setFechaFin(dto.getFechaFin());
        turno.setTipo(Turno.TipoTurno.valueOf(dto.getTipoTurno()));
        turno.setUsuario(peon);
        return turno;
    }

    // Getters y Setters
}