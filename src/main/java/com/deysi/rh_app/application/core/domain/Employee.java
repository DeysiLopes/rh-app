package com.deysi.rh_app.application.core.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;


public class Employee {
    private String id;
    private String name;
    private String email;
    private Department departmentId;
    private Position positionId;
    private LocalDate createdAt;
    private StatusEmpoyee status;

    public Employee() {
    }

    public Employee(String id, String name, String email, Department departmentId, Position positionId, LocalDate createdAt, StatusEmpoyee status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.createdAt = createdAt;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public StatusEmpoyee getStatus() {
        return status;
    }

    public void setStatus(StatusEmpoyee status) {
        this.status = status;
    }
}
