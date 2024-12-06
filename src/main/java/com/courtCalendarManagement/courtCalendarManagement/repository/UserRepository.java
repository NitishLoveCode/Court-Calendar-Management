package com.courtCalendarManagement.courtCalendarManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // custom query for getUserBy Email.
    Optional<UserEntity> findUserByEmail(String email);
} 
