package com.ranadheer.springboot.springbootappdemo.services;

import com.ranadheer.springboot.springbootappdemo.entity.Article;
import com.ranadheer.springboot.springbootappdemo.entity.Comment;
import com.ranadheer.springboot.springbootappdemo.repository.ArticleRepository;
import com.ranadheer.springboot.springbootappdemo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements  CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public CommentServiceImpl(CommentRepository mockCommentRepo) {
        this.commentRepository=mockCommentRepo;
    }

    @Override
    public List<Comment> getComments(){

        return commentRepository.findAll();
    }

    @Override
    public Comment getComment(int id) {
        return commentRepository.getById(id);
    }


    @Override
    public void delete(int id) {
        Comment comment = commentRepository.getById(id);
       commentRepository.delete(comment);
    }

    @Override
    public void update(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public Comment addComment(Comment comment) {
        commentRepository.save(comment);
        return comment;
    }

    @Override
    public Article findArticle(String title) {
        return articleRepository.findByTitle(title);
    }


}
