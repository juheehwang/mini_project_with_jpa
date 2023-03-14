package com.practice.community.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "post")
@Getter @Setter
public class Post {

    private Long id;
    private Long boardId;
    private String title;
    private String content;

    private boolean deleted;
    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private List<File> fileList;
}
