package com.deysi.rh_app.adapters.out.repository.entities;

import com.deysi.rh_app.application.core.domain.StatusEmpoyee;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "tb_employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private DepartmentEntity departmentEntityId;
    private PositionEntity positionEntityId;
    private LocalDate createdAt;
    private StatusEmpoyee status;
}
