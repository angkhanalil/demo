package com.example.demo.repository;

import com.example.demo.domain.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
    
    Users findbyUsername(String username);
    

}
