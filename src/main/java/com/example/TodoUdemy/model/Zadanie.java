package com.example.TodoUdemy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "zadania")
public class Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Opis zadania nie może być pusty")
    private String opis;
    private boolean done;

    Zadanie(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean bool) {
        this.done = bool;
    }
}
