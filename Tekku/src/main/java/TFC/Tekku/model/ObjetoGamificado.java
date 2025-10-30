package com.tekku.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class ObjetivoGamificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private int puntos;

    @ManyToMany
    @JoinTable(
            name = "objetivo_usuario",
            joinColumns = @JoinColumn(name = "objetivo_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private Set<Usuario> completadoPor;

    public ObjetivoGamificado convertirDesdeDTO(ObjetivoGamificadoDTO dto) {
        ObjetivoGamificado objetivo = new ObjetivoGamificado();
        objetivo.setDescripcion(dto.getDescripcion());
        objetivo.setPuntos(dto.getPuntos());
        return objetivo;
    }

    // Getters y Setters
}