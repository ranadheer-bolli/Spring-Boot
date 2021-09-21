package com.ranadheer.springboot.springbootappdemo.repository;

import com.ranadheer.springboot.springbootappdemo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Article findByTitle(String title);
}
