package com.trabalhoOO.rest.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.rest.Models.Desenvolvedora;

public interface DesenvolvedoraRepo extends JpaRepository<Desenvolvedora, Long>{
    
}