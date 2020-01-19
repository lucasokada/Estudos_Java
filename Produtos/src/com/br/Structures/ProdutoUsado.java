package com.br.Structures;

import com.br.Structures.Produto;

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
}
