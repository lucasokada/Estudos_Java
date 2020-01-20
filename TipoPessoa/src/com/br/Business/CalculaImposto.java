package com.br.Business;

import com.br.Structs.Pessoa;

public class CalculaImposto extends Pessoa {

    public CalculaImposto(String nome, String cpf, double rendaAnual, double imposto)
    {
        super(nome, rendaAnual, imposto);
    }

    public static double calculaImpostoPessoa(double gastosSaude, double rendaAnual)
    {
        double imposto;
        imposto = rendaAnual < 20000 ? (0.15 * rendaAnual) - 0.5 * gastosSaude : (0.25 * rendaAnual) - 0.5 * gastosSaude;

        return imposto;
    }

    public static double calculaImpostoPessoa(int numeroFuncionarios, double rendaAnual)
    {
        double imposto;
        imposto = numeroFuncionarios <= 10 ? rendaAnual * 0.16 : rendaAnual * 0.14;

        return imposto;
    }
}
