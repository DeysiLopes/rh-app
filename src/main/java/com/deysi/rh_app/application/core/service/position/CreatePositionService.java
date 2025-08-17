package com.deysi.rh_app.application.core.service.position;

import com.deysi.rh_app.application.core.domain.Position;
import com.deysi.rh_app.application.ports.in.position.CreatePositionCommand;
import com.deysi.rh_app.application.ports.out.position.SavePositionOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePositionService {
    private final SavePositionOutputPort savePositionOutputPort;

    void create(CreatePositionCommand command) throws Exception{
        if(command.title() == null || command.title().isBlank() || command.level() == null || command.level().isBlank()){
            throw new IllegalArgumentException("O titulo e o nivel do cargo nao podem ser nulos ou vazios.");
        }
        var position = new Position();
        position.setTitle(command.title());
        position.setLevel(command.level());
        savePositionOutputPort.savePosition(position);
    }
}
