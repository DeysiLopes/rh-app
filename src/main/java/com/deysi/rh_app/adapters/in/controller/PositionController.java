package com.deysi.rh_app.adapters.in.controller;

import com.deysi.rh_app.adapters.in.controller.request.position.CreatePositionRequest;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentCommand;
import com.deysi.rh_app.application.ports.in.position.CreatePositionCommand;
import com.deysi.rh_app.application.ports.in.position.CreatePositionUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positions")
public class PositionController     {

    private final CreatePositionUsecase positionUsecase;

    public ResponseEntity<Void> createPosition(@RequestBody CreatePositionRequest request) throws Exception{
        var command = new CreatePositionCommand(request.getTitle(), request.getLevel());
        positionUsecase.create(command);
        return ResponseEntity.status(201).build();
    }
}
