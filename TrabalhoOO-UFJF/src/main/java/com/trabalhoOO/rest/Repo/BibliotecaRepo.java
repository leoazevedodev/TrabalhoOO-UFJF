package com.trabalhoOO.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.Biblioteca;

public interface BibliotecaRepo extends JpaRepository<Biblioteca, Long>{
    
}
