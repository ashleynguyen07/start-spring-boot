package com.ashleynguyen.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("In construct: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void calculateMath() {
        System.out.println("3+5= " + (3+5));
    }

    // define our destroy method
    @PreDestroy
    public void clearBean() {
        System.out.println("Cleared!");
    }
    @Override
    public String getDailyWorkout() {
        return "Run up and down 30 times!";
    }
}
