package com.portafolio.portafolio.domain.repository;

import com.portafolio.portafolio.domain.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> getAll();
    Optional<Project> getProject(int projectId);
    Project save(Project project);
    void delete(int projectId);
}
