package com.example.testtask.service;


import com.example.testtask.DB.Users;

import java.util.Map;

public interface UserService {
    Long save(Users user);
    Users findById(long id);

    Map<String, String> updateUser(long id);

//    Map<String, String> updateUser(Long id);
//    Map<String,String> updateUser(Long id);


}
