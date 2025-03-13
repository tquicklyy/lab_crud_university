package com.lab.crud.university.entity;

public class ResultOfTeamCompetition {

    private int id;

    private int competitionId;

    private int teamId;

    private int place;

    private String result;

    private String resultType;

    public ResultOfTeamCompetition() {
    }

    public int getId() {
        return id;
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public int getTeamId() {
        return teamId;
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

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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
