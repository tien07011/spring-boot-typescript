package com.example.springboot.service;

import com.example.springboot.model.User;

public interface IUserService {
    public User findByUsername(String username);
}
