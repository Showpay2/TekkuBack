package com.tekku.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    private NivelFisico nivelFisico;

    public enum NivelFisico {
        BAJO, MEDIO, ALTO
    }


    @ManyToOne
    @JoinColumn(name = "campo_id")
    private CampoTrabajo campo;

    @ManyToMany(mappedBy = "completadoPor")
    private Set<ObjetivoGamificado> objetivosCompletados;

    @OneToMany(mappedBy = "usuario")
   