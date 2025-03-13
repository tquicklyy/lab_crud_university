package com.lab.crud.university.entity;

public class SportTypeSportsFacility {

    private int id;

    private int sportTypeId;

    private int sportsFacilityId;

    public SportTypeSportsFacility() {
    }

    public int getId() {
        return id;
    }

    public int getSportTypeId() {
        return sportTypeId;
    }

    public int getSportsFacilityId() {
        return sportsFacilityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSportTypeId(int sportTypeId) {
        this.sportTypeId = sportTypeId;
    }

    public void setSportsFacilityId(int sportsFacilityId) {
        this.sportsFacilityId = sportsFacilityId;
    }
}

