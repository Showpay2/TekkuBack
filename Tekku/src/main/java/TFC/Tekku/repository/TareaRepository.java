// TareaRepository.java
package com.tekku.repository;

import com.tekku.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {}
