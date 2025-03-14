package com.lab.crud.university.controller;

import com.lab.crud.university.entity.DB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class GlobalController {

    @GetMapping("/")
    public String showLoggingMenu(Model model) {
        model.addAttribute("connectInfo", new DB());
        return "logging-menu-view";
    }

    @PostMapping("/home")
    public String showHomeMenu(@ModelAttribute("connectInfo") DB connectInfo, Model model) {
        try {
            connectInfo.connectToDB();
            return "home-view";
        } catch (SQLException e) {
            model.addAttribute("connectInfo", new DB());
            model.addAttribute("errorMessage", "Error connecting to the DB. Check entered info");
            return "logging-menu-view";
        }
    }

}
