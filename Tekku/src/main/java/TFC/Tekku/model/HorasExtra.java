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

    public HorasExtra convertirDesdeDTO(HorasExtraDTO dto, Usuario usuario) {
        HorasExtra horas = new HorasExtra();
        horas.setFecha(dto.getFecha());
        horas.setCantidadHoras(dto.getCantidadHoras());
        horas.setAprobado(dto.isAprobado());
        horas.setUsuario(usuario);
        return horas;
    }

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters y Setters
}