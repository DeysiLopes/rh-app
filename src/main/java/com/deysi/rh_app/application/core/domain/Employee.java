package com.deysi.rh_app.application.core.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;

@Data
@Entity(name = "tb_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private Department departmentId;
    private Position positionId;
    private LocalDate createdAt;
    private StatusEmpoyee status;
}
