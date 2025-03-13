package com.lab.crud.university.entity;

public class CoachSportType {

    private int id;

    private int coachId;

    private int sportTypeId;

    public CoachSportType() {
    }

    public int getId() {
        return id;
    }

    public int getCoachId() {
        return coachId;
    }

    public int getSportTypeId() {
        return sportTypeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setSportTypeId(int sportTypeId) {
        this.sportTypeId = sportTypeId;
    }
}
