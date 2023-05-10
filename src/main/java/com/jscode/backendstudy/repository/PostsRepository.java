package com.jscode.backendstudy.repository;


import com.jscode.backendstudy.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
