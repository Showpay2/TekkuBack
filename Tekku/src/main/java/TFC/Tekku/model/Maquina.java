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

    public Maquina convertirDesdeDTO(MaquinaDTO dto) {
        Maquina maquina = new Maquina();
        maquina.setNombre(dto.getNombre());
        maquina.setDificultad(Maquina.DificultadFisica.valueOf(dto.getDificultadFisica()));
        return maquina;
    }

    // Getters y Setters
}