package com.deysi.rh_app.adapters.in.controller.request.department;

import lombok.Data;

@Data
public class CreateDepartmentRequest {
    private String id;
    private String name;
    private String costCenterCode;
}
