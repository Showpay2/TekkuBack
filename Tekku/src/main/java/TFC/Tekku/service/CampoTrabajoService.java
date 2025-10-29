// CampoTrabajoService.java
package com.tekku.service;

import com.tekku.model.CampoTrabajo;
import java.util.List;

public interface CampoTrabajoService {
    List<CampoTrabajo> listar();
    CampoTrabajo guardar(CampoTrabajo campo);
}