package com.endava.springcursuniv.restraining.dao;

import com.endava.springcursuniv.restraining.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Long> {
}
