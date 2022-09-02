package com.jwt.course.springsecurityjwt.service;

import java.util.List;

import com.jwt.course.springsecurityjwt.domain.Role;
import com.jwt.course.springsecurityjwt.domain.User;

public interface UserService {
    User saveUser(User user); // sempre que eu chamar esse método eu salvo o usuario no banco
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();    
}