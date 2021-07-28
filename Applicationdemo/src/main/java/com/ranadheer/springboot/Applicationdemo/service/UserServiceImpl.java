package com.ranadheer.springboot.Applicationdemo.service;

import com.ranadheer.springboot.Applicationdemo.dao.UserDAO;
import com.ranadheer.springboot.Applicationdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void createUser(User user) {
       userDAO.createUser(user);
    }
    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
            userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        User user = userDAO.getUser(id);
        return user;
    }


}
