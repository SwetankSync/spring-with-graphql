package com.example.demo.pojo;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public class FitnessClass {
    UUID id;
    Coach coach;
    LocalDateTime startsAt;
    LocalDateTime endsAt;
    Difficulty difficulty;
}
