package com.korenevskij.news_portal.repository;

import com.korenevskij.news_portal.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{}