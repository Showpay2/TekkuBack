package com.tekku.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class CampoTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;


    public CampoTrabajo convertirDesdeDTO(CampoTrabajoDTO dto) {
        CampoTrabajo campo = new CampoTrabajo();
        campo.setNombre(dto.getNombre());
        return campo;
    }

    @OneToMany(mappedBy = "campo")
    private Set<Usuario> jefesDeEquipo;



    // Getters y Setters
}