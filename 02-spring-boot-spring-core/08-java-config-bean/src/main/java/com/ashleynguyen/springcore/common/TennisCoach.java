package com.ashleynguyen.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("In construct: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run up and down 30 times!";
    }
}
