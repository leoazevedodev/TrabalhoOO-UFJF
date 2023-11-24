package com.trabalhoOO.rest.Models;

public class Cliente extends Usuario {

    private String cpf;
    private int idade;
    private double carteira;
    private Biblioteca biblioteca;

    public Cliente(long id, String nome, String email, String senha, String cpf, int idade, double carteira, Biblioteca biblioteca) {
        super(id, nome, email, senha);
        this.cpf = cpf;
        this.idade = idade;
        this.carteira = carteira;
        this.biblioteca = biblioteca;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public void comprarJogo(Jogo jogo) {
        if (Mercado.temJogo(jogo)) {
            if (!(biblioteca.temJogo(jogo))) {
                if (this.carteira >= jogo.getPreco()) {
                    this.carteira -= jogo.getPreco();
                    this.biblioteca.addJogo(jogo);
                    jogo.venda();
                    System.out.println("Compra realizada com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else {
                System.out.println("Jogo já comprado!");
            }
        } else {
            System.out.println("Jogo não disponível!");
        }
    }

    public boolean temJogo(Jogo jogo) {
        return this.biblioteca.temJogo(jogo);
    }

}