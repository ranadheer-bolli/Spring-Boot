package com.ranadheer.springboot.springbootappdemo.dto;

import com.ranadheer.springboot.springbootappdemo.entity.Article;
import com.ranadheer.springboot.springbootappdemo.entity.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private int id;
    private String userName;
    private String email;
    private String phoneNo;
    private String password;
    private List<Article> articleList;
    private List<Role> roleList;
}
