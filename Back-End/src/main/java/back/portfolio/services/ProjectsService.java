package back.portfolio.services;

import back.portfolio.models.projects;
import back.portfolio.repositories.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {
    private final ProjectsRepository projectsRepository;

    @Autowired
    public ProjectsService(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    public List<projects> getAllProjects() {
        return projectsRepository.findAll();
    }

    public projects createProject(projects project) {
        return projectsRepository.save(project);
    }

    // Otros métodos para actualizar, eliminar, obtener por ID, etc.
}
