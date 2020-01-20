package com.br.Structs;

import java.util.List;

public class PessoaJuridica extends Pessoa{

    private int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, double imposto, int numeroFuncionarios)
    {
        super(nome, rendaAnual, imposto);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    @Override
    public String toString(List<Pessoa> pessoas, int posicao) {
        return super.toString(pessoas, posicao) + ", numero de funcionarios: " + getNumeroFuncionarios();
    }
}
