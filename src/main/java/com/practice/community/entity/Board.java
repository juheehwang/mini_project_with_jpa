package com.practice.community.entity;

import jakarta.persistence.Entity;

@Entity
public class Board {
    private Long id;
    private String boardName;
    private Long categoryId;
    private boolean display;
    private boolean deleted;

}
