package com.deysi.rh_app.adapters.out.repository;

import com.deysi.rh_app.adapters.out.repository.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
