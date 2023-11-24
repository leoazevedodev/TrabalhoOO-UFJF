package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public class Desenvolvedora extends Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String Nome;

    @Column
    private int Seguidores;

    @Column
    private Float Faturamento;

    @Column
    private Float CNPJ;


    public long getId() 
    {
        return Id;
    }

    public void setId(long id) 
    {
        Id = id;
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String nome) 
    {
        Nome = nome;
    }

    public int getSeguidores() 
    {
        return Seguidores;
    }
    
    public void setSeguidores(int seguidores) 
    {
        Seguidores = seguidores;
    }

    public Float getFaturamento() 
    {
        return Faturamento;
    }

    public void setFaturamento(Float faturamento) 
    {
        Faturamento = faturamento;
    }

    public Float getCNPJ() 
    {
        return CNPJ;
    }

    public void setCNPJ(Float cNPJ) 
    {
        CNPJ = cNPJ;
    }
}
