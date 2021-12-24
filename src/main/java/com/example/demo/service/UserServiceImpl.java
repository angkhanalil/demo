package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.domain.Role;
import com.example.demo.domain.Users;
import com.example.demo.repository.RoleRepo;
import com.example.demo.repository.UserRepo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
 

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
 
 

    public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
  
        Users user = userRepo.findbyUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);

    }

    @Override
    public Users getUser(String username) {
        return userRepo.findbyUsername(username);
    }

    @Override
    public List<Users> getUsers() {
        
        return userRepo.findAll();
    }

    @Override
    public Role savaRole(Role role) {
         
        return roleRepo.save(role);
    }

    @Override
    public Users saveUser(Users user) { 
        //log.info("saving new user to the database");
       
        return userRepo.save(user);
        
    }
    
    
}
