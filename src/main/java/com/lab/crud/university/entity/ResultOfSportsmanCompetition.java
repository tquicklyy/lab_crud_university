package com.lab.crud.university.entity;

public class ResultOfSportsmanCompetition {

    private int id;

    private int competitionId;

    private int sportsmanId;

    private int place;

    private String result;

    private String resultType;

    public ResultOfSportsmanCompetition() {
    }

    public int getId() {
        return id;
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public int getSportsmanId() {
        return sportsmanId;
    }

    public int getPlace() {
        return place;
    }

    public String getResult() {
        return result;
    }

    public String getResultType() {
        return resultType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompetitionId(int competitionId) {
        this.competitionId = competitionId;
    }

    public void setSportsmanId(int sportsmanId) {
        this.sportsmanId = sportsmanId;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
