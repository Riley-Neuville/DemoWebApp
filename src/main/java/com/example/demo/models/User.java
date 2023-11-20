package com.example.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany()
    @JoinColumn(name = "user_id")
    private final List<Event> jobs= new ArrayList<>();

    public User(){}

    public User(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
