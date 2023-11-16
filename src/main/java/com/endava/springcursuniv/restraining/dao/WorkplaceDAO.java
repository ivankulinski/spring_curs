package com.endava.springcursuniv.restraining.dao;

import com.endava.springcursuniv.restraining.entity.WorkplaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkplaceDAO extends JpaRepository<WorkplaceEntity, Long> {
}
