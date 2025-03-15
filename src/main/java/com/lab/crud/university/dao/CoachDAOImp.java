package com.lab.crud.university.dao;

import com.lab.crud.university.entity.Coach;
import com.lab.crud.university.entity.DB;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CoachDAOImp implements CoachDAO {

    private PreparedStatement pS;
    private ResultSet rS;

    private String queryForDB;

    private static final int LIMIT = 10;

    @Override
    public List<List<Object>> getCoaches(int page) throws SQLException {

        queryForDB = "SELECT * FROM coach LIMIT ? OFFSET ?";

        pS = DB.getConnectionToDB().prepareStatement(queryForDB);
        pS.setInt(1, LIMIT);
        pS.setInt(2, LIMIT * page);

        rS = pS.executeQuery();

        List<List<Object>> coaches = new ArrayList<>();

        List<Object> coach;
        while(rS.next()) {
            coach = new ArrayList<>();
            coach.add(rS.getInt("id"));
            coach.add(rS.getString("name"));
            coach.add(rS.getString("surname"));
            coach.add(rS.getString("patronymic"));
            coach.add(rS.getDate("date_of_birth").toLocalDate());
            coach.add(rS.getString("telephone"));
            coach.add(rS.getString("email"));
            coaches.add(coach);
        }
        return coaches;
    }

    @Override
    public int getCountOfPages() throws SQLException {
        queryForDB = "SELECT COUNT(*) FROM coach";
        pS = DB.getConnectionToDB().prepareStatement(queryForDB);
        rS = pS.executeQuery();
        rS.next();
        return (int)(Math.ceil(( (double)rS.getInt(1) / LIMIT)));
    }

    @Override
    public void addCoach(Coach coach) {

    }

    @Override
    public void updateCoach(int id) {

    }

    @Override
    public void deleteCoach(int id) {

    }
}
