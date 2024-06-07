package tizianosanseverino.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="lecterary_element")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_element")
public abstract class  LecteraryElement {
    @Id
    private UUID isbn;
    @Column(name="title")
    private String title;
    @Column(name="year_of_publication")
    private int yearOfPublication;
    @Column(name = "number_of_page")
    private int numberOfPage;

    public LecteraryElement() {

    }
}
