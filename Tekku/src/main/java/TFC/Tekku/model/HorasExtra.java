package com.tekku.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class HorasExtra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private int cantidadHoras;
    private boolean aprobado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters y Setters
}