package com.example.testtask.controller;

import com.example.testtask.DB.Users;
import com.example.testtask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class Controller {
    UserService userService;
    @GetMapping("/{userId}")
    public Users getUser(@PathVariable String userId){

        return userService.findById(Integer.parseInt(userId));
    }
    @PostMapping
    public long addUser(@RequestBody Users user){
        return userService.save(user);
    }
    @PutMapping("/{userId}")
    public Map<String,String> updateUserStatus(@PathVariable String userId){
        return userService.updateUser(Integer.parseInt(userId));
    }
}
