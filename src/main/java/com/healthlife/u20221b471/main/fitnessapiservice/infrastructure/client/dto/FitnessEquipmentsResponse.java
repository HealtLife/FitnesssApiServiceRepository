package com.healthlife.u20221b471.main.fitnessapiservice.infrastructure.client.dto;

import com.healthlife.u20221b471.main.fitnessapiservice.domain.model.aggregates.Equipments;


import java.util.List;

public class FitnessEquipmentsResponse {
    private boolean success;
    private List<Equipments> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Equipments> getData() {
        return data;
    }

    public void setData(List<Equipments> data) {
        this.data = data;
    }
}
