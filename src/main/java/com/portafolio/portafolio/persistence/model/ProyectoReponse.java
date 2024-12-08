package com.portafolio.portafolio.persistence.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proyecto")
public class ProyectoReponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Integer idProyecto;

    @Column(name = "titulo_proyecto", nullable = false)
    private String tituloProyecto;

    @Column(name = "descripcion_proyecto")
    private String descripcionProyecto;

    @Column(name = "imagen_proyecto")
    private String imagenProyecto;

}

