package tizianosanseverino.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_biblio")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private long cardNumb;

@OneToMany(mappedBy = "user")
private List<Loan> loans = new ArrayList<Loan>();


    public User (){}
}
