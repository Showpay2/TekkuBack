package com.tekku.model;

import jakarta.persistence.*;

@Entity
public class AsignacionMaquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario peon;

    @ManyToOne
    private Maquina maquina;


}