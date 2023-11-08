package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public class ListaAmigos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    
    @OneToOne
    @JoinColumn(name = "UsuarioID", referencedColumnName = "id")
    private Usuario Usuario;

    @OneToOne
    @JoinColumn(name = "AmigoID", referencedColumnName = "id")
    private Usuario Amigo;
    
}
