package com.trabalhoOO.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.Usuario;

public interface UserRepo extends JpaRepository<Usuario, Long>{
    
}
