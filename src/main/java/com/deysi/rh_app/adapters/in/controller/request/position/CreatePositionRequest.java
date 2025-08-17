package com.deysi.rh_app.adapters.in.controller.request.position;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreatePositionRequest {
    private String title;
    private String level;
}
