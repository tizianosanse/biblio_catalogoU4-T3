package tizianosanseverino.entities;


import jakarta.persistence.Entity;

import tizianosanseverino.enums.Periodicity;

import java.util.UUID;

@Entity

public class Magazine extends LecteraryElement{

    private Periodicity periodicity;

    public Magazine (){}
}
