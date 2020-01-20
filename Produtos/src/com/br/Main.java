package com.br;

import com.br.Business.GeraLista;
import com.br.Structures.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Produto> produto = new ArrayList<>();

        Produto.GeraListaProduto(produto);
        GeraLista.adicionaListaProduto(produto,"user1", 5600);
        GeraLista.adicionaListaProduto(produto, "user2", 3600);
        GeraLista.adicionaListaProduto(produto ,"user3", 600, 50);
        GeraLista.adicionaListaProduto(produto ,"user4", 5100, 70);
        GeraLista.adicionaListaProduto(produto ,"user5", 5600, "01/03/2020");
        GeraLista.adicionaListaProduto(produto ,"user6", 700, "31/01/2020");

        for(int i=0; i<produto.size(); i++)
        {
            System.out.println(produto.get(i).toString(produto, i));
        }
    }
}


