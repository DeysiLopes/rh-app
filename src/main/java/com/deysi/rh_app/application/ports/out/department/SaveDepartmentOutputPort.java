package com.deysi.rh_app.application.ports.out.department;

import com.deysi.rh_app.application.core.domain.Department;

public interface SaveDepartmentOutputPort {
    void saveDepartment(Department department) throws Exception;
    Department findDepartmentById(Long id) throws Exception;
    void deleteDepartment(Long id) throws Exception;
    void updateDepartment(Department department) throws Exception;
}
