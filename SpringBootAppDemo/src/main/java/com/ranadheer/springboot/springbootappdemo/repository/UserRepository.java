package com.ranadheer.springboot.springbootappdemo.repository;

import com.ranadheer.springboot.springbootappdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String s);
}
