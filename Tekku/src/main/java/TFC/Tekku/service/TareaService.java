package com.tekku.service;

import com.tekku.model.Tarea;
import java.util.List;

public interface TareaService {
    List<Tarea> listar();
    Tarea guardar(Tarea tarea);
}