package com.portafolio.portafolio.domain.service;

import com.portafolio.portafolio.domain.Project;
import com.portafolio.portafolio.domain.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public List<Project> getAll() {
        return  projectRepository.getAll();
    }

    public Optional<Project> getProject(int projectId){
        return projectRepository.getProject(projectId);
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public boolean delete(int projectId) {
        return getProject(projectId).map(project -> {
            projectRepository.delete(projectId);
            return true;
        }).orElse(false);
    }
}
