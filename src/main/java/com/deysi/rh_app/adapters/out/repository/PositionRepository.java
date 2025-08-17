package com.deysi.rh_app.adapters.out.repository;

import com.deysi.rh_app.adapters.out.repository.entities.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, UUID> {
}
