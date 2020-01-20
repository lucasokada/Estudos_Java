package com.br;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.br.Business.CalculaImposto;
import com.br.Business.OperacoesLista;
import com.br.Structs.Pessoa;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Pessoa> pessoa = new ArrayList<>();
        int opcao, numeroFuncionarios;
        double rendaAnual, gastoSaude, imposto;
        String nome, cpf;

        do {
            Pessoa.menu();
            System.out.println("digite a opcao desejada");
            opcao = input.nextInt();

            if(opcao == 1 || opcao == 2){
                input.nextLine();
                System.out.println("digite o nome da pessoa");
                nome = input.nextLine();
                System.out.println("digite a renda anual da pessoa");
                rendaAnual = input.nextDouble();

                switch (opcao){
                    case 1: //pessoa fisica
                        input.nextLine();
                        System.out.println("digite o cpf");
                        cpf = input.nextLine();
                        System.out.println("a pessoa tem gastos com saude? (1 - sim, 2 - nao)");
                        int existeGasto = input.nextInt();

                        if(existeGasto == 1){
                            System.out.println("digite os gastos com saude:");
                            gastoSaude = input.nextDouble();
                            imposto = CalculaImposto.calculaImpostoPessoa(gastoSaude, rendaAnual);
                            OperacoesLista.adicionaPessoa(pessoa, nome, cpf, rendaAnual, imposto, gastoSaude);
                        }else if(existeGasto == 2){
                            imposto = CalculaImposto.calculaImpostoPessoa(0.0, rendaAnual);
                            OperacoesLista.adicionaPessoa(pessoa, nome, cpf, rendaAnual, imposto);
                        }
                    break;

                    case 2: //pessoa juridica
                            System.out.println("digite o numero de funcionarios");
                            numeroFuncionarios = input.nextInt();
                            imposto = CalculaImposto.calculaImpostoPessoa(numeroFuncionarios, rendaAnual);
                            OperacoesLista.adicionaPessoa(pessoa, nome,  rendaAnual, imposto, numeroFuncionarios);
                    break;

                    default:
                    break;
                }
            }else if(opcao == 3){

                for(int i=0; i<pessoa.size(); i++)
                {
                    System.out.println("---------------------------------------------------------------------------------------------------------------");
                    System.out.println(pessoa.get(i).toString(pessoa, i));
                }
            }

        }while (opcao != 0);
    }
}
