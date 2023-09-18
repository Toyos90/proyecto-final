package back.portfolio.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="portfolio")

public class portfolio {
    @Id
    @Column(name = "id")

    private Long id;
    @Column(name = "title") // Usa el mismo nombre que en la tabla portfolio
    private String title;
    @Column(name = "link") // Usa el mismo nombre que en la tabla portfolio
    private String url;
    @Column(name = "img_url") // Usa el mismo nombre que en la tabla portfolio
    private String imgUrl;

}
