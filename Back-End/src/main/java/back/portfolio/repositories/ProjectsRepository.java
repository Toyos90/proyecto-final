package back.portfolio.repositories;
import back.portfolio.models.projects;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectsRepository extends JpaRepository<projects, Long>{

}
