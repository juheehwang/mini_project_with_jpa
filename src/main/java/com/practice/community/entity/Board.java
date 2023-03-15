package com.practice.community.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "board")
public class Board {

    private Long id;
    private String boardName;
    private Long categoryId;
    private boolean display;
    private boolean deleted;



}
