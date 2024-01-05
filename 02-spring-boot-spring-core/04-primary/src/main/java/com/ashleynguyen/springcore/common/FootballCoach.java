package com.ashleynguyen.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 2km before going to the lesson";
    }
}
