package com.deysi.rh_app.adapters.out;

import com.deysi.rh_app.adapters.out.repository.mappers.PositionMapper;
import com.deysi.rh_app.adapters.out.repository.PositionRepository;
import com.deysi.rh_app.application.core.domain.Position;
import com.deysi.rh_app.application.ports.out.position.SavePositionOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SavePositionAdapter implements SavePositionOutputPort {
    private final PositionRepository repository;
    private final PositionMapper mapper;


    @Override
    public void savePosition(Position position) throws Exception {
        var positionEntity = mapper.toPositionEntity(position);
        repository.save(positionEntity);
    }
}
