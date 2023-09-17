package back.portfolio.controllers;

import back.portfolio.models.projects;
import back.portfolio.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {
    private final ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping
    public List<projects> getAllProjects() {
        return projectsService.getAllProjects();
    }

    @PostMapping
    public projects createProject(@RequestBody projects project) {
        return projectsService.createProject(project);
    }
}
