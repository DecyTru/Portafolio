package com.portafolio.portafolio.domain.service;

import com.portafolio.portafolio.persistence.model.ProyectoReponse;
import com.portafolio.portafolio.persistence.repository.ProyectoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepositorio proyectoRepository;

    public ProyectoReponse guardarProyecto(ProyectoReponse proyecto) {
        return proyectoRepository.save(proyecto);
    }
}
