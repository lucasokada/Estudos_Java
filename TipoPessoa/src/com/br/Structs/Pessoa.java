package com.br.Structs;

import java.util.List;

public abstract class Pessoa {

    protected String nome;
    protected double rendaAnual;
    protected double imposto;

    public Pessoa(String nome, double rendaAnual, double imposto)
    {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.imposto = imposto;
    }

    public String getNome()
    {
        return nome;
    }

    public double getRendaAnual()
    {
        return rendaAnual;
    }

    public double getImposto()
    {
        return imposto;
    }

    public static void menu()
    {
        System.out.println("--------------------------------------------MENU---------------------------------------------------------------");
        System.out.println("1 - adicionar pessoa física");
        System.out.println("2 - adicionar pessoa juridica");
        System.out.println("3 - mostrar lista");
        System.out.println("0 - sair");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

    public String toString(List<Pessoa> pessoas, int posicao)
    {
        return "nome: " + pessoas.get(posicao).nome + ", renda anual: " + pessoas.get(posicao).rendaAnual + ", imposto: " + pessoas.get(posicao).imposto;
    }
}
