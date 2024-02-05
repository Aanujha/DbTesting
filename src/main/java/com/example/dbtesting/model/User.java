package com.example.dbtesting.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "user_type" ,columnDefinition = "VARCHAR(255) DEFAULT 'customer'")
    private String userType;
    @Column(name = "email",nullable = false)
    private String email;


}
