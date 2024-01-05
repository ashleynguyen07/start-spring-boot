package com.ashleynguyen.springcore.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In construct: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters before going on the lesson!";
    }
}
