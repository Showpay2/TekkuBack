package com.tekku.service;

import com.tekku.model.AsignacionMaquina;

public interface AsignacionMaquinaService {
    AsignacionMaquina asignarMaquina(Long peonId, Long maquinaId);
}