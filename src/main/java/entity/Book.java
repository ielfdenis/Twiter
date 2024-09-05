package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(schema = "identity", name = "books")
public class Book { @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;private String name;
}
