package com.jscode.backendstudy.domain;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "board")
public class Posts {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(length = 50, nullable = false) private String title;
    @Column(length = 500, nullable = false) private String content;

    protected Posts(){}

    private Posts(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Posts of(String title, String content){return new Posts(title, content);}
}