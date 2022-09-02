package com.jwt.course.springsecurityjwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.course.springsecurityjwt.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
    Role findByName(String name);
}