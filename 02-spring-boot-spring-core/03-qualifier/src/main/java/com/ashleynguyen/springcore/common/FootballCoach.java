package com.ashleynguyen.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 2km before going to the lesson";
    }
}
