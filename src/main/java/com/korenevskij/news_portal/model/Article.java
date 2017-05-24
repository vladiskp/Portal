package com.korenevskij.news_portal.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "articles", schema = "public")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private int articleId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "posting_date", nullable = false)
    private Date posting_date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User author;

    @OneToMany(mappedBy = "articles", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<Comment> comments;
}