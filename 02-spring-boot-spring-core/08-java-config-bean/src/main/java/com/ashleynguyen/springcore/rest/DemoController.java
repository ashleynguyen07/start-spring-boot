package com.ashleynguyen.springcore.rest;

import com.ashleynguyen.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // create a private field for the dependency
    private Coach myCoach;

    @Autowired // create an injection
    public DemoController(
            @Qualifier("bean-config") Coach myCoach
    ) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
