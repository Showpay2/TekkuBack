package com.tekku.service;

import com.tekku.model.Turno;
import java.util.List;

public interface TurnoService {
    List<Turno> listar();
    Turno guardar(Turno turno);
}