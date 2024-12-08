package com.portafolio.portafolio.web.controller;

import com.portafolio.portafolio.domain.Project;
import com.portafolio.portafolio.domain.service.ProjectService;
import com.portafolio.portafolio.domain.service.ProyectoService;
import com.portafolio.portafolio.persistence.model.ProyectoReponse;
import com.portafolio.portafolio.persistence.model.ProyectoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProyectoService proyectoService;

    @GetMapping("/all")
    public List<Project> getAll() {
        return projectService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Project> getProject(@PathVariable("id") int projectId) {
        return projectService.getProject(projectId);
    }

    @PostMapping("/save")
    public ResponseEntity<Project> save(@RequestBody Project project) {
        try {
            Project savedProject = projectService.save(project);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedProject);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Object> guardar(@RequestBody ProyectoRequest proyectoRequest) {
        try {
            ProyectoReponse proyecto = new ProyectoReponse();
            proyecto.setTituloProyecto(proyectoRequest.getTitulo_proyecto());
            proyecto.setDescripcionProyecto(proyectoRequest.getDescripcionProyecto());
            proyecto.setImagenProyecto(proyectoRequest.getImagenProyecto());

            ProyectoReponse proyectoGuardado = proyectoService.guardarProyecto(proyecto);
            return ResponseEntity.status(HttpStatus.CREATED).body(proyectoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al guardar el proyecto: " + e.getMessage());
        }
    }


    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id")int projectId) {
        return projectService.delete(projectId);
    }
}
