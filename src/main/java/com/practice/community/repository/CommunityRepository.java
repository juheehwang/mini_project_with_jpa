package com.practice.community.repository;

import com.practice.community.entity.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommunityRepository {

    private final EntityManager em;

    public void savePost(Post post){
        em.persist(post);
    }

    public Post findOne(Long id){
        return em.find(Post.class,id);
    }

    public List<Post> findByAll(){
        TypedQuery<Post> postTypedQuery = em.createQuery("select p from Post p join p.file f", Post.class)
                .setMaxResults(1000);
        return postTypedQuery.getResultList();
    }
}
