package com.practice.community.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Embeddable
@Getter @Setter
public class File {

    @Id
    @Column(name = "file_id")
    private Long id;
    @Column
    private String fileName;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
    private boolean deleted;
    private String saveName;

    private String createdBy;
}
