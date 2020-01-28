package com.br.entities;

public class Produto {
    private String nome;
    protected double precoUnitario;
    protected int quantidade;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calculaTotal()
    {
        return precoUnitario * quantidade;
    }
}
