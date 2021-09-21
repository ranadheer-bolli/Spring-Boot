package com.ranadheer.springboot.springbootappdemo.dto;

import com.ranadheer.springboot.springbootappdemo.entity.Article;
import com.ranadheer.springboot.springbootappdemo.entity.User;
import lombok.Data;

@Data
public class CommentDTO {

    private int id;
    private String comment;
    private User userId;
    private Article articleId;

}
