package com.deysi.rh_app.application.core.service.department;

import com.deysi.rh_app.application.core.domain.Department;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentCommand;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentUsecase;
import com.deysi.rh_app.application.ports.out.department.SaveDepartmentOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateDepartmentService implements CreateDepartmentUsecase {

    private final SaveDepartmentOutputPort saveDepartmentOutputPort;

    @Override
    public void create(CreateDepartmentCommand command) throws Exception {
       var department = new Department();
       department.setName(command.name());
       department.setCostCenterCode(command.costCenterCOde());
       saveDepartmentOutputPort.saveDepartment(department);
    }
}
