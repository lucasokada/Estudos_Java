package com.br.Structures;

import com.br.Structures.Produto;

public class ProdutoImportado extends Produto {

    private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco, double taxaAlfandega)
    {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }
}
