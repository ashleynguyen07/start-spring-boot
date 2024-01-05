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
    private Coach adamCoach;

    @Autowired // create an injection
    public DemoController(
            @Qualifier("tennisCoach") Coach myCoach,
            @Qualifier("yogaCoach") Coach adamCoach
    ) {
        this.myCoach = myCoach;
        this.adamCoach = adamCoach;
    }

    @GetMapping("/check-singleton")
    public String check() {
        return "Result: " + (myCoach == adamCoach);
    }
    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
