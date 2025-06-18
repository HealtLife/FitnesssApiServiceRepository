package com.healthlife.u20221b471.main.fitnessapiservice.interfaces;


import com.healthlife.u20221b471.main.fitnessapiservice.application.services.FitnessApiService;
import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Exercise;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fitnessapiservice")
public class FitnessController {
    private final FitnessApiService fitnessApiService;

    public FitnessController(FitnessApiService fitnessApiService) {
        this.fitnessApiService = fitnessApiService;
    }

    @GetMapping("/exercises")
    public ResponseEntity<List<Exercise>> getExercises() {
        return ResponseEntity.ok(fitnessApiService.getAllExercises());
    }
    @GetMapping("/muscles/{muscle}/exercises")
    public List<Exercise> getExercisesByMuscle(@PathVariable String muscle) {
        return fitnessApiService.getExercisesByMuscule(muscle);
    }
    @GetMapping("/bodyparts/{bodyPart}/exercises")
    public List<Exercise> getExcercisesByBodyPart(@PathVariable String bodyPart) {
        return fitnessApiService.getExercisesByBodyPart(bodyPart);
    }

}
