package com.portafolio.portafolio.persistence;

import com.portafolio.portafolio.domain.Project;
import com.portafolio.portafolio.domain.repository.ProjectRepository;
import com.portafolio.portafolio.persistence.crud.ProyectoCrudRepository;
import com.portafolio.portafolio.persistence.entity.Proyecto;
import com.portafolio.portafolio.persistence.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProyectoRepository implements ProjectRepository  {

    @Autowired
    private ProyectoCrudRepository proyectoCrudRepository;

    @Autowired
    private ProjectMapper mapper;

    @Override
    public List<Project> getAll(){
        List<Proyecto> proyectos = (List<Proyecto>) proyectoCrudRepository.findAll();
        return mapper.toProjects(proyectos);
    }
    @Override
    public Optional<Project> getProject(int projectId) {
        return  proyectoCrudRepository.findById(projectId).map(proyecto -> mapper.toProject(proyecto));
    }

    @Override
    public Project save(Project project) {
        Proyecto proyecto = mapper.toProyecto(project);
        return mapper.toProject(proyectoCrudRepository.save(proyecto));
    }

    @Override
    public void delete(int projectId){
        proyectoCrudRepository.deleteById(projectId);
    }
}