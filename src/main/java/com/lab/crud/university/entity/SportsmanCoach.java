package com.lab.crud.university.entity;

import java.time.LocalDate;

public class SportsmanCoach {

    private int id;

    private int sportsmanId;

    private int coachId;

    private LocalDate startDate;

    private LocalDate endDate;

    public SportsmanCoach() {
    }

    public int getId() {
        return id;
    }

    public int getSportsmanId() {
        return sportsmanId;
    }

    public int getCoachId() {
        return coachId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSportsmanId(int sportsmanId) {
        this.sportsmanId = sportsmanId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
