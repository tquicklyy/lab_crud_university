package com.lab.crud.university.entity;

public class SportsmanSportType {

    private int id;

    private int sportsmanId;

    private int sportTypeId;

    public SportsmanSportType() {
    }

    public int getId() {
        return id;
    }

    public int getSportsmanId() {
        return sportsmanId;
    }

    public int getSportTypeId() {
        return sportTypeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSportsmanId(int sportsmanId) {
        this.sportsmanId = sportsmanId;
    }

    public void setSportTypeId(int sportTypeId) {
        this.sportTypeId = sportTypeId;
    }
}
