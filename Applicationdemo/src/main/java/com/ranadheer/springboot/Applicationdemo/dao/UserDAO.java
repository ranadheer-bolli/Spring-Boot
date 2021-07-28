package com.ranadheer.springboot.Applicationdemo.dao;

import com.ranadheer.springboot.Applicationdemo.entity.User;

public interface UserDAO {
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUser(int id);
}
