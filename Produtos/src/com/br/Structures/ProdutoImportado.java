package com.br.Structures;

import com.br.Structures.Produto;

import java.util.List;

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

    @Override
    public String toString(List<Produto> produtos, int posicao) {
        return super.toString(produtos, posicao) + ", taxa de alfandega: " + getTaxaAlfandega();
    }
}
