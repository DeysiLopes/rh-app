package com.deysi.rh_app.adapters.out.repository.entities;

import com.deysi.rh_app.application.core.domain.StatusEmpoyee;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity(name = "tb_employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntityId;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private PositionEntity positionEntityId;
    private LocalDate createdAt;
    @Enumerated(EnumType.STRING)
    private StatusEmpoyee status;
}
