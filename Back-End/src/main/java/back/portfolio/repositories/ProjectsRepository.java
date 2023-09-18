package back.portfolio.repositories;
import back.portfolio.models.portfolio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectsRepository extends JpaRepository<portfolio, Long>{

}
