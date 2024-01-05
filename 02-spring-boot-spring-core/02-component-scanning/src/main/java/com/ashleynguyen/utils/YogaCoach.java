package com.ashleynguyen.utils;

import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice 15 mins workout before going on Yoga Lesson";
    }
}
