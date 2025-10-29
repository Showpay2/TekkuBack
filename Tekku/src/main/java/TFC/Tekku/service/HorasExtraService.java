package com.tekku.service;

import com.tekku.model.HorasExtra;
import java.util.List;

public interface HorasExtraService {
    List<HorasExtra> listar();
    HorasExtra guardar(HorasExtra horasExtra);
}
