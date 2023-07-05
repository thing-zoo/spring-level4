package com.example.springlevel4.repository;

import com.example.springlevel4.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findByPostIdAndId(Long postId, Long id);
}
