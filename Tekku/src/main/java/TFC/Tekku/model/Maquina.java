package com.tekku.model;

import jakarta.persistence.*;

@Entity
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private DificultadFisica dificultad;

    public enum DificultadFisica {
        BAJA, MEDIA, ALTA
    }

    // Getters y Setters
}