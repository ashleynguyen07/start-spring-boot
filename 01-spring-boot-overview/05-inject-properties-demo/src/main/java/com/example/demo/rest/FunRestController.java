package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties
    @Value("${mentorName.name}")
    private String mentorName;

    @Value("${internshipName.name}")
    private String internshipName;

    @GetMapping("/team-info")
    public String teamInfo() {
        return "Mentor: " + mentorName + " ." + "Internship: " + internshipName;
    }



}
