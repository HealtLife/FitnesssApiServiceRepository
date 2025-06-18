package com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto;

import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Muscle;

import java.util.List;

public class FitnessMuscleResponse {
    private boolean success;
    private List<Muscle> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Muscle> getData() {
        return data;
    }

    public void setData(List<Muscle> data) {
        this.data = data;
    }
}