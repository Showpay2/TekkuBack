package com.tekku.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class CampoTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "campo")
    private Set<Usuario> jefesDeEquipo;

    // Getters y Setters
}