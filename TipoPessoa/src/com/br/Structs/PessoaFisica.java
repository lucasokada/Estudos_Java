package com.br.Structs;

import java.util.List;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private double gastosSaude;

    public PessoaFisica(String nome, String cpf, double rendaAnual, double imposto, double gastosSaude)
    {
        super(nome, rendaAnual, imposto);
        this.gastosSaude = gastosSaude;
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf, double rendaAnual, double imposto)
    {
        super(nome, rendaAnual, imposto);
        this.cpf = cpf;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(List<Pessoa> pessoas, int posicao) {
        return super.toString(pessoas, posicao) + ", cpf: " + getCpf() + ", gastos com saude: " + getGastosSaude();
    }
}
