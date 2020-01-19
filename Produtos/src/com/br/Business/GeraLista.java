package com.br.Business;

import com.br.Structures.Produto;
import com.br.Structures.ProdutoImportado;
import com.br.Structures.ProdutoUsado;

import java.util.List;

public class GeraLista extends Produto {

    public GeraLista(String nome1, double preco1) {
        super(nome1, preco1);
    }

    public static void adicionaListaProduto(List<Produto> produtos ,String nome, double preco)
    {
        produtos.add(new Produto(nome, preco));
    }

    public static void adicionaListaProduto(List<Produto> produtos ,String nome, double preco, double taxaAlfandega)
    {
        produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
    }

    public static void adicionaListaProduto(List<Produto> produtos ,String nome, double preco, String data)
    {
        produtos.add(new ProdutoUsado(nome, preco, data));
    }

    public static void mostraListaProduto(List<Produto> produtos)
    {
        int i;

        for(i=0; i<produtos.size(); i++)
        {
            System.out.println(produtos.get(i));
        }
    }
}
