package com.br.Structures;

import com.br.Structures.Produto;

import java.util.List;

public class ProdutoUsado extends Produto {

    private String dataFabricacao;

    public ProdutoUsado(String nome, double preco, String data)
    {
        super(nome, preco);
        this.dataFabricacao = data;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    @Override
    public String toString(List<Produto> produtos, int posicao) {
        return super.toString(produtos, posicao) + ", data fabricacao: " + getDataFabricacao();
    }
}
