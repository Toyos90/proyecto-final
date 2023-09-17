package back.portfolio.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="projects")

public class projects {
    @Id
    @Column(name = "id")

    private Long id;
    @Column(name = "link")
    private String url;
    @Column(name = "img_url")
    private String imgUrl;
}
