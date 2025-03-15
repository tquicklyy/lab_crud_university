package com.lab.crud.university.controller;

import com.lab.crud.university.entity.Coach;
import com.lab.crud.university.service.CoachServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ReadController {

    @Autowired
    private CoachServiceImp coachServiceImp;

    @GetMapping("guide-data/coach/read")
    public String showCoaches(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        try {
            List<List<Object>> coaches = coachServiceImp.getCoaches(page);
            int totalPages = coachServiceImp.getCountOfPages();

            ArrayList<String> columnNames = new ArrayList<>();
            columnNames.add("id");
            columnNames.add("name");
            columnNames.add("surname");
            columnNames.add("patronymic");
            columnNames.add("date_of_birth");
            columnNames.add("telephone");
            columnNames.add("email");


            model.addAttribute("columnNames", columnNames);
            model.addAttribute("coaches", coaches);
            model.addAttribute("totalPages", totalPages);
            model.addAttribute("currentPage", page);
            model.addAttribute("nameOfTable", "Coach");

            return "read-view";
        } catch (SQLException e) {
            return "";
        }
    }
}
