package com.deysi.rh_app.application.ports.in.position;

public interface CreatePositionUsecase {
    void create(CreatePositionCommand command) throws Exception;
}
