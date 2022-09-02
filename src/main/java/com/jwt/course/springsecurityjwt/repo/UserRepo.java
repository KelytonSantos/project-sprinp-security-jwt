package com.jwt.course.springsecurityjwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.course.springsecurityjwt.domain.User;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByUsername(String username);
}