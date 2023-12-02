package com.trabalhoOO.rest.Models;

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
    private Float Faturamento = 0f;

    @Column
    private String CNPJ;



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

    public Float getFaturamento() 
    {
        return Faturamento;
    }

    public void setFaturamento(Float faturamento) 
    {
        Faturamento = faturamento;
    }

    public String getCNPJ() 
    {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) 
    {
        CNPJ = cNPJ;
    }
}
