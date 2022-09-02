package com.jwt.course.springsecurityjwt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data/*<--consigo gerar getters and setters*/ @NoArgsConstructor @AllArgsConstructor @Table(name = "tb_role")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}