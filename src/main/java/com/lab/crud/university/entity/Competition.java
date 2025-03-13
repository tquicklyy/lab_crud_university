package com.lab.crud.university.entity;

import java.time.LocalDate;

public class Competition {

    private int id;

    private String name;

    private LocalDate dateOfEvent;

    private int SportTypeId;

    private int SportFacilityId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfEvent() {
        return dateOfEvent;
    }

    public int getSportTypeId() {
        return SportTypeId;
    }

    public int getSportFacilityId() {
        return SportFacilityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfEvent(LocalDate dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public void setSportTypeId(int sportTypeId) {
        SportTypeId = sportTypeId;
    }

    public void setSportFacilityId(int sportFacilityId) {
        SportFacilityId = sportFacilityId;
    }
}
