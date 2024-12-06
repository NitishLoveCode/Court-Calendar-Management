package com.courtCalendarManagement.courtCalendarManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;
import com.courtCalendarManagement.courtCalendarManagement.repository.UserRepository;


@Service
public class UserServiceImpl implements UserInterface {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with Id" + id));
    }

    @Override
    public Optional<UserEntity> getUserByEmail(String email) {
        Optional<UserEntity> user = userRepository.findUserByEmail(email);
        if(user.isEmpty()){
            throw new RuntimeException("User not fund with Email " + email);
        }
        return user;
    }

    @Override
    public void deleteUserById(int id) {
        if(!userRepository.existsById(id)){
            throw new RuntimeException("User not found with ID" + id);
        }
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity updateUser(int id, UserEntity user) {
        UserEntity existingUser = getUserById(id);

        // Updating user.
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setFristName(user.getFristName());
        existingUser.setLastName(user.getLastName());
        return userRepository.save(existingUser);
    }
    
}
