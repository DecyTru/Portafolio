package com.portafolio.portafolio.persistence.mapper;

import com.portafolio.portafolio.domain.Project;
import com.portafolio.portafolio.persistence.entity.Proyecto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    @Mapping(source = "projectId", target = "idProyecto")
    @Mapping(source = "projectTitle", target = "tituloProyecto")
    @Mapping(source = "projectDescription", target = "descripcionProyecto")
    @Mapping(source = "projectImage", target = "imagenProyecto")
    Proyecto toProyecto(Project project);

    @Mapping(source = "idProyecto", target = "projectId")
    @Mapping(source = "tituloProyecto", target = "projectTitle")
    @Mapping(source = "descripcionProyecto", target = "projectDescription")
    @Mapping(source = "imagenProyecto", target = "projectImage")
    Project toProject(Proyecto proyecto);

    List<Project> toProjects(List<Proyecto> proyectos);
}

