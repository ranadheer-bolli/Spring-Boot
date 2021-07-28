package com.ranadheer.springboot.Applicationdemo.dao;

import com.ranadheer.springboot.Applicationdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void  createUser(User user){
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        //Session session = entityManager.unwrap(Session.class);
        // User user = session.get(User.class,id);
        User user1 = entityManager.merge(user);
        System.out.println(user.getId());
        System.out.println(user1.getId());
        user.setId(user1.getId()) ;
    }

    @Override
    public void deleteUser(int id) {
        // Session session = entityManager.unwrap(Session.class);
        // session.delete(user);
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);
    }

    @Override
    public User getUser(int id) {
        // Session session = entityManager.unwrap(Session.class);
        // User user=session.get(User.class,id);
        User user = entityManager.find(User.class,id);
        return user;
    }
}
