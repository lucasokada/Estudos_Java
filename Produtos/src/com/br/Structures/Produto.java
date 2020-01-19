package com.br.Structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Produto {
    private String nome;
    protected double preco;

    public Produto(String nome1, double preco1)
    {
        this.nome = nome1;
        this.preco = preco1;
    }

    public String getNome()
    {
        return nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public static void GeraListaProduto(List<Produto> produtos)
    {
        if(produtos == null){
            produtos = new ArrayList<>();
        }
    }
}
