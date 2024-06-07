package tizianosanseverino.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue
    private long idLoan;
    private Date dateBegin;
    private Date dateExpectedReturn;
    private Date dateEffectiveReturn;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



}
