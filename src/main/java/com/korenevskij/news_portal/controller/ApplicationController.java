package com.korenevskij.news_portal.controller;

import com.korenevskij.news_portal.model.Article;
import com.korenevskij.news_portal.service.ArticleService;
import com.korenevskij.news_portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
public class ApplicationController {

    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test(Model model) {
        return "index";
    }

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public ResponseEntity<List<Article>> listAllArticles() {
        List<Article> articles = articleService.listArticles();
        return new ResponseEntity<List<Article>>(articles, HttpStatus.OK);
    }
}