package com.practice.community.repository;

import com.practice.community.entity.Board;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final EntityManager em;

    public void save(Board board){
        em.persist(board);
    }
    public List<Board> findAllBoard(){
       return em.createQuery("select b from board b",Board.class).getResultList();
    }
}
