package com.tekku.model;

import jakarta.persistence.*;

@Entity
public class AsignacionMaquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public AsignacionMaquina convertirDesdeDTO(AsignacionMaquinaDTO dto, Usuario peon, Maquina maquina) {
        AsignacionMaquina asignacion = new AsignacionMaquina();
        asignacion.setPeon(peon);
        asignacion.setMaquina(maquina);
        return asignacion;
    }

    @ManyToOne
    private Usuario peon;

    @ManyToOne
    private Maquina maquina;


}