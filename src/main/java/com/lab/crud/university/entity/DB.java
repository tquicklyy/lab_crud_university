package com.lab.crud.university.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception ignored) {}
    }

    private String user;

    private String password;

    private static Connection connectionToDB;

    public DB() {
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public static Connection getConnectionToDB() {
        return connectionToDB;
    }


    public void connectToDB() throws SQLException {
        connectionToDB = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/sports_event", user, password);
    }
}
