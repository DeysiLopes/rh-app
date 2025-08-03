package com.deysi.rh_app.application.core.domain;

public class Department {
    private Long id;
    private String name;
    private String costCenterCode;

    public Department() {
    }

    public Department(Long id, String name, String costCenterCode) {
        this.id = id;
        this.name = name;
        this.costCenterCode = costCenterCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
