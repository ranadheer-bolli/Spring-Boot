package com.ranadheer.springboot.SprindDataJPAdemo.repository;

import com.ranadheer.springboot.SprindDataJPAdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // no code required
}
