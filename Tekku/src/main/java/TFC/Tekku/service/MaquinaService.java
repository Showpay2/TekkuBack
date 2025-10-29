// MaquinaService.java
package com.tekku.service;

import com.tekku.model.Maquina;
import java.util.List;

public interface MaquinaService {
    List<Maquina> listar();
    Maquina guardar(Maquina maquina);
}