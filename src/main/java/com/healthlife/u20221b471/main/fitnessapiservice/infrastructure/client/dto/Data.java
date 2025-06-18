package com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto;

import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Exercise;

import java.util.List;

public class Data {

    private List<Exercise> exercises;

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
