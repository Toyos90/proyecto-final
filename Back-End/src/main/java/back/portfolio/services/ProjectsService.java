package back.portfolio.services;

import back.portfolio.models.portfolio;
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

    public List<portfolio> getAllProjects() {
        return projectsRepository.findAll(); // Usa el método findAll() para obtener todos los proyectos
    }
}