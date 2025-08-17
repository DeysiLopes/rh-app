package com.deysi.rh_app.adapters.out.repository.mappers;

import com.deysi.rh_app.adapters.out.repository.entities.PositionEntity;
import com.deysi.rh_app.application.core.domain.Position;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    PositionEntity toPositionEntity(Position position);
    Position toPosition(PositionEntity positionEntity);
}
