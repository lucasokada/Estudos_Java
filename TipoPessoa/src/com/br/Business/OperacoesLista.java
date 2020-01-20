package com.br.Business;

import com.br.Structs.Pessoa;
import com.br.Structs.PessoaFisica;
import com.br.Structs.PessoaJuridica;
import java.util.List;

public class OperacoesLista {

    public static void adicionaPessoa(List<Pessoa> pessoa, String nome, String cpf, double rendaAnual, double imposto, double gastosSaude)
    {
        pessoa.add(new PessoaFisica(nome, cpf, rendaAnual, imposto, gastosSaude));
    }

    public static void adicionaPessoa(List<Pessoa> pessoa, String nome, String cpf, double rendaAnual, double imposto)
    {
        pessoa.add(new PessoaFisica(nome, cpf, rendaAnual, imposto, 0));
    }

    public static void adicionaPessoa(List<Pessoa> pessoa, String nome, double rendaAnual, double imposto, int numeroFuncionarios)
    {
        pessoa.add(new PessoaJuridica(nome, rendaAnual, imposto, numeroFuncionarios));
    }
}
