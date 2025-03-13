package com.lab.crud.university.entity;

import java.time.LocalDate;

public class Team {

    private int id;

    private String name;

    private LocalDate dateOfFoundation;

    private int sportTypeId;

    private String country;

    public Team() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public int getSportTypeId() {
        return sportTypeId;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public void setSportTypeId(int sportTypeId) {
        this.sportTypeId = sportTypeId;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
