package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public class Loja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne
    @JoinColumn(name = "JogoID", referencedColumnName = "id")
    private Jogos Jogo;
}
