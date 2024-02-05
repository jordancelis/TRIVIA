package prueba.preuba.curso.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  long id;

    @Column(name = "name")
    private String name;
    @Column(name = "descriptión")
    private String description;

}
