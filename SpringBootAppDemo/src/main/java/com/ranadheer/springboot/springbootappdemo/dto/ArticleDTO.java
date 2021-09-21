package com.ranadheer.springboot.springbootappdemo.dto;

import com.ranadheer.springboot.springbootappdemo.entity.Comment;
import com.ranadheer.springboot.springbootappdemo.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class ArticleDTO {

    private int id;
    private String article;
    private String title;
    private User userId;
    private List<Comment> commentList;

}
