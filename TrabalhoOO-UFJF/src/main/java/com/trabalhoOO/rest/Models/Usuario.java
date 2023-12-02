package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public abstract class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String Nome;

    @Column
    private String Email;

    @Column
    private String Senha;
    

    
    // @Column
    // private int Idade;

    // Decidir mais tarde se colocar cidade
//    @Column
//    private String Cidade;

    @Column
    private String Pais;

    // @Column
    // private String Status;


    Usuario() {}

    public Usuario(String nome, String email, String senha, String pais, String cidade) {
        super();
        Nome = nome;
        Email = email;
        Senha = senha;
        Pais = pais;
        Cidade = cidade;
    }

    // public long getId() 
    // {
    //     return Id;
    // }

    // public void setId(long id) 
    // {
    //     Id = id;
    // }

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

    public String getEmail() 
    {
        return Email;
    }

    public void setEmail(String email) 
    {
        Email = email;
    }

    public String getSenha() 
    {
        return Senha;
    }

    public void setSenha(String senha) 
    {
        Senha = senha;
    }

    // public int getIdade() 
    // {
    //     return Idade;
    // }

    // public void setIdade(int idade) 
    // {
    //     Idade = idade;
    // }

//    public String getCidade()
//    {
//        return Cidade;
//    }
//
//    public void setCidade(String cidade)
//    {
//        Cidade = cidade;
//    }

    public String getPais() 
    {
        return Pais;
    }

    public void setPais(String pais) 
    {
        Pais = pais;
    }

    // public String getStatus() 
    // {
    //     return Status;
    // }

    // public void setStatus(String status) 
    // {
    //     Status = status;
    // }
}
