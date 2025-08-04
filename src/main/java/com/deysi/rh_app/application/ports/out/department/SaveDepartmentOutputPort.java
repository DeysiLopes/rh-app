package com.deysi.rh_app.application.ports.out.department;

import com.deysi.rh_app.application.core.domain.Department;

import java.util.UUID;

public interface SaveDepartmentOutputPort {
    void saveDepartment(Department department) throws Exception;
    Department findDepartmentById(UUID id) throws Exception;
    void deleteDepartment(UUID id) throws Exception;
    void updateDepartment(Department department) throws Exception;
}
