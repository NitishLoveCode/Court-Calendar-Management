package com.courtCalendarManagement.courtCalendarManagement.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courtCalendarManagement.courtCalendarManagement.Entitys.UserEntity;
import com.courtCalendarManagement.courtCalendarManagement.services.UserInterface;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserInterface userService;

    @Autowired
    public UserController(UserInterface userService){
        this.userService = userService;
    }

    // Create user by id
    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        System.out.println("-----------------------------------Creating user -----------------------------------------------");
        UserEntity createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    // Get all User.
    @GetMapping
    public ResponseEntity<List<UserEntity>> allUser(){
        System.out.println("-----------------------------------------------hello request is commig at" + " /api/users");
        List<UserEntity> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    // Find user by id.
    @GetMapping("id/{id}")
    public ResponseEntity<UserEntity> getUserByid(@PathVariable int id){
        UserEntity user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    // Get user by email.
    @GetMapping("email/{email}")
    public ResponseEntity<UserEntity> getUserByEmail(@PathVariable String email){
        Optional<UserEntity> user = userService.getUserByEmail(email);
        if(user.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.get());
    }

    // Delete user by id
    @DeleteMapping("/id/{id}")
    public String deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
        return "User deleted Sucess";
    }

    // Update User by id.
    @PutMapping("/id/{id}")
    public ResponseEntity<UserEntity> updateUserById(@RequestBody UserEntity user, @PathVariable int id){
        UserEntity updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }
}
