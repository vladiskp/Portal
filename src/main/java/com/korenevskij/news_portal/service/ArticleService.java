package com.korenevskij.news_portal.service;

import com.korenevskij.news_portal.model.Article;

import java.util.List;

public interface ArticleService {

    void addArticle(Article article);

    void updateArticle(Article article);

    void removeArticle(int id);

    Article getArticleById(int id);

    List<Article> listArticles();
}