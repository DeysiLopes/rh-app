package com.deysi.rh_app.application.ports.in.department;

import com.deysi.rh_app.adapters.in.controller.request.department.CreateDepartmentRequest;

public interface CreateDepartmentUsecase {

    void create(CreateDepartmentCommand command);

}
