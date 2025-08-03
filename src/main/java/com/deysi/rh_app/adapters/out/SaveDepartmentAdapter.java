package com.deysi.rh_app.adapters.out;

import com.deysi.rh_app.adapters.in.controller.mapper.DepartmentMapper;
import com.deysi.rh_app.adapters.out.repository.DepartmentRepository;
import com.deysi.rh_app.application.core.domain.Department;
import com.deysi.rh_app.application.ports.out.department.SaveDepartmentOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveDepartmentAdapter implements SaveDepartmentOutputPort {

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    @Override
    public void saveDepartment(Department department) throws Exception {
        var departmentEntity = mapper.toDepartmentEntity(department);
        repository.save(departmentEntity);
    }

    @Override
    public Department findDepartmentById(Long id) throws Exception {
        // Implementation for finding a department by ID
        return null;
    }

    @Override
    public void deleteDepartment(Long id) throws Exception {
        // Implementation for deleting a department
    }

    @Override
    public void updateDepartment(Department department) throws Exception {
        // Implementation for updating a department
    }
}
