package com.deysi.rh_app.adapters.in.controller.mapper;

import com.deysi.rh_app.adapters.out.repository.entities.DepartmentEntity;
import com.deysi.rh_app.application.core.domain.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentEntity toDepartmentEntity(Department department);
    Department toDepartment(DepartmentEntity department);
}
