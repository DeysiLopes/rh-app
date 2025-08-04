package com.deysi.rh_app.adapters.in.controller;

import com.deysi.rh_app.adapters.in.controller.request.department.CreateDepartmentRequest;
import com.deysi.rh_app.adapters.in.controller.response.CreateDepartmentResponse;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentCommand;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private final CreateDepartmentUsecase departmentUsecase;

     @PostMapping
     public ResponseEntity<Void> createDepartment(@RequestBody CreateDepartmentRequest request) throws Exception {
         var command = new CreateDepartmentCommand(request.getName(), request.getCostCenterCode());
         departmentUsecase.create(command);
         return ResponseEntity.status(201).build();
     }

}
