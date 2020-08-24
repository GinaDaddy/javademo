package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.domain.Vehicle;

@Configuration
public class Config {

    @Bean
    public Vehicle getVehicle() {
        return new Vehicle() {
            private String type = "Santafe";
            private String brand = "Hyundai";
            @Override
            public String drive() {
                return String.format("%s %s is drving", brand, type);
            }
        };
    }
}
