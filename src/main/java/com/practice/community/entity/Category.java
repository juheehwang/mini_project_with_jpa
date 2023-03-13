package com.practice.community.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {

    private Long id;
    private String categoryName;
    private boolean display;
    private boolean deleted;
}
