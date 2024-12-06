package com.courtCalendarManagement.courtCalendarManagement.services;
import java.util.List;
import java.util.Optional;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;


public interface UserInterface {
    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUser();
    UserEntity getUserById(int id);
    Optional<UserEntity> getUserByEmail(String email);
    void deleteUserById(int id);
    UserEntity updateUser(int id, UserEntity user);
}
