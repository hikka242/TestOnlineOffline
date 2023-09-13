package com.example.testtask.service;

import com.example.testtask.exception.UserNotFoundException;
import com.example.testtask.DB.Users;
import com.example.testtask.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    UserRepo userRepo;
    @Override
    public Long save(Users user) {
      long id= userRepo.save(user).getId();
        return id;
    }

    @Override
    public Users findById(long id) {
        if(userRepo.findById(id).isEmpty())
            throw new UserNotFoundException("User does not exist");

        return userRepo.findById(id).get();
    }


    @Override
    public Map<String, String> updateUser(long id) {
        if(userRepo.findById(id).isEmpty())
            throw new UserNotFoundException("User does not exist");
        Users user =userRepo.findById(id).get();
        Map<String,String> updateResponse = new HashMap<>();
        updateResponse.put("id",user.getId()+"");
        updateResponse.put("previous status", user.getStatus());
        if(user.getStatus().equalsIgnoreCase("offline")){
            user.setStatus("online");
            updateResponse.put("current status", user.getStatus());
        }else{
            user.setStatus("offline");
            updateResponse.put("current status", user.getStatus());
        }
        userRepo.save(user);
        return updateResponse;
    }

}
