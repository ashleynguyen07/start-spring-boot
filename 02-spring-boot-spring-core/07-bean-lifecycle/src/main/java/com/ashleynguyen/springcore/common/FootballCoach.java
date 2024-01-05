package com.ashleynguyen.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public FootballCoach() {
        System.out.println("In construct: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 2km before going to the lesson";
    }
}
