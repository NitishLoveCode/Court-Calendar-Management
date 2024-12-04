package com.courtCalendarManagement.courtCalendarManagement.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courtCalendarManagement.courtCalendarManagement.entity.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
    


    // Create new User
    @PostMapping
    public User createUser(@RequestBody User user){
        return null;
    }

    // Get all user
    @GetMapping
    public List<User> getAllUser(){
        return null;
    }

    // get User By id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long Id){
        return null;
    }

    // Update user by ID
    @PutMapping("/{id}")
    public User updateUser(@PathVariable User id, @RequestBody User user){
        return null;
    }

    // Delete User
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable User id){
        return null;
    }
}
