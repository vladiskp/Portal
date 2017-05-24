package com.korenevskij.news_portal.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comments", schema = "public")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "posting_date", nullable = false)
    private Date posting_date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
}