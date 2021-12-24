package com.example.demo.repository;

import com.example.demo.domain.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role,Long>{
  Role findByName(String name);   
}
