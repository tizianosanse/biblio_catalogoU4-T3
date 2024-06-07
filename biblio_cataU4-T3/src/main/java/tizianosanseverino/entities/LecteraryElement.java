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

    private String title;

    private int yearOfPublication;

    private int numberOfPage;

    public LecteraryElement() {

    }

    public LecteraryElement( String title,int yearOfPublication,int numberOfPage) {
        this.yearOfPublication = yearOfPublication;
        this.title = title;
        this.numberOfPage = numberOfPage;
    }

    public String getTitle() {
        return title;
    }
}
