package com.ranadheer.springboot.Applicationdemo.service;

import com.ranadheer.springboot.Applicationdemo.entity.User;

public interface UserService {
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUser(int id);
}
