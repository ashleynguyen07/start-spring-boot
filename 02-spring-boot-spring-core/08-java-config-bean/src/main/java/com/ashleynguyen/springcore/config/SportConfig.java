package com.ashleynguyen.springcore.config;

import com.ashleynguyen.springcore.common.Coach;
import com.ashleynguyen.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("bean-config")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
