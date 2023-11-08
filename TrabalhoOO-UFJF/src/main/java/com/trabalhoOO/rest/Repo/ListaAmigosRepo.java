package com.trabalhoOO.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.ListaAmigos;

public interface ListaAmigosRepo extends JpaRepository<ListaAmigos, Long>{
    
}