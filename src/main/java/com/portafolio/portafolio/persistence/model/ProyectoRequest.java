package com.portafolio.portafolio.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "proyecto")
public class ProyectoRequest {

    @Column(name = "titulo_proyecto", nullable = false)
    private String titulo_proyecto;

    @Column(name = "descripcion_proyecto", nullable = false)
    private String descripcionProyecto;

    @Column(name = "imagen_proyecto", nullable = false)
    private String imagenProyecto;
}
