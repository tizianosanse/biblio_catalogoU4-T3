package tizianosanseverino.entities;

import jakarta.persistence.*;



@Entity

public class Book extends LecteraryElement {
    private String author;
    private String type;



    public Book (){}
}
