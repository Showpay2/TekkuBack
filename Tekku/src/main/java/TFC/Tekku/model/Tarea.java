package com.tekku.model;

import jakarta.persistence.*;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private DificultadFisica dificultad;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario asignadoA;

    public enum DificultadFisica {
        BAJA, MEDIA, ALTA
    }

    public enum Estado {
        PENDIENTE, EN_PROGRESO, COMPLETADA
    }

    // Getters y Setters
}