package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    private String name;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @DateTimeFormat(pattern = "HH::mm")
    private Time time;

public Event(){}

    public Event(String name, User user, String description, Date date, Time time){
    this.user = user;
    this.name = name;
    this.description =  description;
    this.date = date;
    this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }
}
