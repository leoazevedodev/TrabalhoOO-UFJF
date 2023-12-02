package com.trabalhoOO.rest.Models;

import jakarta.persistence.*;

@Entity
public class Cliente extends Usuario {
    Cliente() {
        super();
    }

    public Cliente(String Nome, String Email, String Senha, String Pais, String Cidade, String CPF) {
        super(Nome, Email, Senha, Pais, Cidade);
        this.CPF = CPF;
    }

    private String CPF;

    public String getCPF() 
    {
        return CPF;
    }

    public void setCPF(String cPF) 
    {
        CPF = cPF;
    }
}
