package com.trabalhoOO.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.Jogos;

public interface JogosRepo extends JpaRepository<Jogos, Long>{
    
}
