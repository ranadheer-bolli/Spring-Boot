package com.ranadheer.springboot.springbootappdemo.services;

import com.ranadheer.springboot.springbootappdemo.entity.Article;
import com.ranadheer.springboot.springbootappdemo.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ArticlesService{
    public void delete(int id);
    public Article get(int id);

    public List<Article> get();

    void update(Article article);

    Article addArticle(Article article);
    Optional<User> findUser(String s);

   Page<Article> findPaginated(int pageNo,int pageSIze);


}
