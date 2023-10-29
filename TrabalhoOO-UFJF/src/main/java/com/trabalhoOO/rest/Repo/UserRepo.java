package com.trabalhoOO.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{
    
}
