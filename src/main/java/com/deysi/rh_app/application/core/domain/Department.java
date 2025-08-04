package com.deysi.rh_app.application.core.domain;

import java.util.UUID;

public class Department {
    private UUID id;
    private String name;
    private String costCenterCode;

    public Department() {
    }

    public Department(UUID id, String name, String costCenterCode) {
        this.id = id;
        this.name = name;
        this.costCenterCode = costCenterCode;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

}
