package com.lab.crud.university.service;

import com.lab.crud.university.dao.CoachDAO;
import com.lab.crud.university.entity.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CoachServiceImp implements CoachService {

    @Autowired
    private CoachDAO coachDAO;

    @Override
    public List<List<Object>> getCoaches(int page) throws SQLException {
        return coachDAO.getCoaches(page);
    }

    @Override
    public int getCountOfPages() throws SQLException {
        return coachDAO.getCountOfPages();
    }

    @Override
    public void addCoach(Coach coach) {
        coachDAO.addCoach(coach);
    }

    @Override
    public void updateCoach(int id) {
        coachDAO.updateCoach(id);
    }

    @Override
    public void deleteCoach(int id) {
        coachDAO.deleteCoach(id);
    }
}
