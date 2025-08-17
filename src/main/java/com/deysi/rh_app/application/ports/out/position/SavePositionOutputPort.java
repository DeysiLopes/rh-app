package com.deysi.rh_app.application.ports.out.position;

import com.deysi.rh_app.application.core.domain.Position;

public interface SavePositionOutputPort {
    void savePosition(Position position) throws Exception;
}
