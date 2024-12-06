package com.courtCalendarManagement.courtCalendarManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;

public interface User extends JpaRepository<UserEntity, Integer> {

    // custom query for getUserBy Email.
    UserEntity findUserByEmail(String email);
} 
