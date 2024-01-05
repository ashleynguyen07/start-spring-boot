package com.ashleynguyen.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // create a bean
public class YogaCoach implements Coach {
    @Override // override - ghi đè method getDailyWorkout()
    public String getDailyWorkout() {
        return "Practice 15 mins workout before going on Yoga Lesson";
    }
}
