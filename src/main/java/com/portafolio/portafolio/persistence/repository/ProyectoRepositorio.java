package com.portafolio.portafolio.persistence.repository;

import com.portafolio.portafolio.persistence.model.ProyectoReponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepositorio extends JpaRepository<ProyectoReponse, Integer> {
}
