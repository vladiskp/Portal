package com.korenevskij.news_portal.service;

import com.korenevskij.news_portal.model.Article;
import com.korenevskij.news_portal.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Transactional
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Transactional
    public void updateArticle(Article article) {
        // write own QUERY in ArticleRepository class
    }

    @Transactional
    public void removeArticle(int id) {
        articleRepository.delete(id);
    }

    @Transactional
    public Article getArticleById(int id) {
        return articleRepository.findOne(id);
    }

    @Transactional
    public List<Article> listArticles() {
        return articleRepository.findAll();
    }
}