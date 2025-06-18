package com.healthlife.u20221b471.main.fitnessapiservice.application.services;

import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Equipments;
import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Exercise;
import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Muscle;
import com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto.FitnessApiResponse;
import com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto.FitnessEquipmentsResponse;
import com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto.FitnessMuscleResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FitnessApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_URL = "https://exercisedb-api.vercel.app/api/v1";

    public List<Exercise> getAllExercises() {
        String exercises = "/exercises";
        FitnessApiResponse response = restTemplate.getForObject(API_URL + exercises, FitnessApiResponse.class);
        return response != null ? response.getDataExercises().getExercises() : List.of();
    }
    public List<Muscle> getAllMuscle() {
        String muscles = "/muscles";
        FitnessMuscleResponse response = restTemplate.getForObject(API_URL + muscles, FitnessMuscleResponse.class);
        return response != null ? response.getData() : List.of();
    }

    public List<Equipments> getAllEquipments() {
        String equipments = "/equipments";
        FitnessEquipmentsResponse response = restTemplate.getForObject(API_URL + equipments, FitnessEquipmentsResponse.class);
        return response != null ? response.getData() : List.of();
    }

    public List<Exercise> getExercisesByMuscule(String muscle) {
        String exercises = "/muscles/" + muscle + "/exercises";
        FitnessApiResponse response = restTemplate.getForObject(API_URL + exercises, FitnessApiResponse.class);
        return response != null ? response.getDataExercises().getExercises() : List.of();
    }

    public List<Exercise> getExercisesByBodyPart(String bodyPart) {
        String exercises = "/bodyparts/" + bodyPart + "/exercises";
        FitnessApiResponse response = restTemplate.getForObject(API_URL + exercises, FitnessApiResponse.class);
        return response != null ? response.getDataExercises().getExercises() : List.of();
    }
    public List<Exercise> getExercisesByEquipment(String equipment) {
        String exercises = "/equipments/" + equipment + "/exercises";
        FitnessApiResponse response = restTemplate.getForObject(API_URL + exercises, FitnessApiResponse.class);
        return response != null ? response.getDataExercises().getExercises() : List.of();
    }
}
