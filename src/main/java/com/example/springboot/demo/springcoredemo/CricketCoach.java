package com.example.springboot.demo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice for 15mins!!!" ;
    }
}