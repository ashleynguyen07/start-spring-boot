package com.ashleynguyen.springcore.rest;

import com.ashleynguyen.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // create a private field for the dependency
    @Autowired
    private Coach myCoach;

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
