package com.example.demo.repository;

import com.example.demo.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    
    User findbyUsername(String username);


}
