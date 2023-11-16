package com.endava.springcursuniv.restraining.dao;

import com.endava.springcursuniv.restraining.entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeDAO extends JpaRepository<OfficeEntity, Long> {
}
