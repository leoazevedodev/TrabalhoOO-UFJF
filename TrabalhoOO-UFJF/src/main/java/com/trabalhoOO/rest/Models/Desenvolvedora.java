package com.trabalhoOO.rest.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Desenvolvedora extends Usuario {

    Desenvolvedora() {
        super();
    }

    public Desenvolvedora(String Nome, String Email, String Senha, String Pais, String Cidade, String CNPJ) {
        super(Nome, Email, Senha, Pais, Cidade);
        this.CNPJ = CNPJ;
    }


    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long Id;

    // @Column
    // private String Nome;

    // @Column
    // private int Seguidores;


    @Column
    private String CNPJ;

    @Column
    private List<Jogos> jogos = new ArrayList<Jogos>();




    // public long getId() 
    // {
    //     return Id;
    // }

    // public void setId(long id) 
    // {
    //     Id = id;
    // }

    // public String getNome() 
    // {
    //     return Nome;
    // }

    // public void setNome(String nome) 
    // {
    //     Nome = nome;
    // }

    // public int getSeguidores() 
    // {
    //     return Seguidores;
    // }
    
    // public void setSeguidores(int seguidores) 
    // {
    //     Seguidores = seguidores;
    // }

    

    public String getCNPJ() 
    {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) 
    {
        CNPJ = cNPJ;
    }
}
