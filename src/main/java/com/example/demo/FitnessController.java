package com.example.demo;

import com.example.demo.pojo.Coach;
import com.example.demo.pojo.Difficulty;
import com.example.demo.pojo.FitnessClass;
import graphql.GraphQLContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Controller
public class FitnessController {
    public List<FitnessClass> schedule(@Argument Coach coach, GraphQLContext context) {
            log.info("schedule({})",coach);
            var Startsat= LocalDateTime.now();
            return List.of(FitnessClass.builder().id(UUID.randomUUID()).coach(coach).startsAt(Startsat).endsAt(Startsat.plusHours(1L))
                    .difficulty(Difficulty.BEGINNER).build());
    }
}
