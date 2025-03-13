package com.lab.crud.university.entity;

import java.time.LocalDate;

public class SportsmanTeam {

    private int id;

    private int teamId;

    private int sportsmanId;

    private LocalDate dateJoined;

    private LocalDate dateLeft;

    public SportsmanTeam() {
    }

    public int getId() {
        return id;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getSportsmanId() {
        return sportsmanId;
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

    public void setSportsmanId(int sportsmanId) {
        this.sportsmanId = sportsmanId;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setDateLeft(LocalDate dateLeft) {
        this.dateLeft = dateLeft;
    }
}
