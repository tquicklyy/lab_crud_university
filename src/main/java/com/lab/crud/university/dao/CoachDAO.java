package com.lab.crud.university.dao;

import com.lab.crud.university.entity.Coach;

import java.sql.SQLException;
import java.util.List;

public interface CoachDAO {

    public List<List<Object>> getCoaches(int page) throws SQLException;
    public int getCountOfPages() throws SQLException;
    public void addCoach(Coach coach);
    public void updateCoach(int id);
    public void deleteCoach(int id);
}
