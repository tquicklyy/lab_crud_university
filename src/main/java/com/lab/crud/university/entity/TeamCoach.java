package com.lab.crud.university.entity;

import java.time.LocalDate;

public class TeamCoach {

    private int id;

    private int teamId;

    private int coachId;

    private LocalDate dateJoined;

    private LocalDate dateLeft;

    public TeamCoach() {
    }

    public int getId() {
        return id;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getCoachId() {
        return coachId;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public LocalDate getDateLeft() {
        return dateLeft;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setDateLeft(LocalDate dateLeft) {
        this.dateLeft = dateLeft;
    }
}
