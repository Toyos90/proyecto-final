package back.portfolio.controllers;

import back.portfolio.models.portfolio;
import back.portfolio.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bbdd_portfolio/portfolio")
public class ProjectsController {
    private final ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping
    @ResponseBody
    public List<portfolio> getAllProjects() {
        return projectsService.getAllProjects();
    }

}
