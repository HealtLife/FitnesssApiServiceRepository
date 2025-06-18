package com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto;

import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Exercise;
import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Muscle;

import java.util.List;

public class DataExercises {

    private List<Exercise> exercises;



    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }



}
