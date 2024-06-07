package tizianosanseverino.entities;

import jakarta.persistence.*;



@Entity

public class Book extends LecteraryElement {
    private String author;
    private String type;

    public Book (){}

    public Book(String title, int yearOfPublication, int numberOfPage, String author, String type) {
        super(title, yearOfPublication, numberOfPage);
        this.author = author;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }


}
