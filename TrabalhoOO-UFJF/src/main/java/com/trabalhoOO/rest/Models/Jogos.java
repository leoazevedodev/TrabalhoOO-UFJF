package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public class Jogos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne
    @JoinColumn(name = "DesenvolvedoraID", referencedColumnName = "id")
    private Desenvolvedora Desenvolvedora;

    @Column
    private String Nome;

    @Column
    private String Categoria;

    @Column
    private int Classificacao;

    @Column
    private float Preco;

    @Column
    private float Desconto;

    @Column
    private String Imagem;


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

    public String getCategoria() 
    {
        return Categoria;
    }

    public void setCategoria(String categoria) 
    {
        Categoria = categoria;
    }

    public int getClassificacao() 
    {
        return Classificacao;
    }

    public void setClassificacao(int classificacao) 
    {
        Classificacao = classificacao;
    }

    public float getPreco() 
    {
        return Preco;
    }

    public void setPreco(float preco) 
    {
        Preco = preco;
    }

    public float getDesconto() 
    {
        return Desconto;
    }

    public void setDesconto(float desconto) 
    {
        Desconto = desconto;
    }

    public String getImagem() 
    {
        return Imagem;
    }

    public void setImagem(String imagem) 
    {
        Imagem = imagem;
    }

}
