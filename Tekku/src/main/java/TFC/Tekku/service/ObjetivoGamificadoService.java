package com.tekku.service;

import com.tekku.model.ObjetivoGamificado;
import java.util.List;

public interface ObjetivoGamificadoService {
    List<ObjetivoGamificado> listar();
    ObjetivoGamificado guardar(ObjetivoGamificado objetivo);
}