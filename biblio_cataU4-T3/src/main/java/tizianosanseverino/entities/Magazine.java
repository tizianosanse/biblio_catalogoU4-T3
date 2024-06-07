package tizianosanseverino.entities;


import jakarta.persistence.Entity;

import tizianosanseverino.enums.Periodicity;

import java.util.UUID;

@Entity
public class Magazine extends LecteraryElement{

    private Periodicity periodicity;

    public Magazine (){}

    public Magazine(String title, int yearOfPublication, int numberOfPage, Periodicity periodicity) {
        super(title, yearOfPublication, numberOfPage);
        this.periodicity = periodicity;
    }


}
