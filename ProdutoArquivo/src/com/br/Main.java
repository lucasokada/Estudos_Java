package com.br;

import com.br.entities.Produto;
import com.br.file.FileOperations;
import com.br.utitlities.DoubleOperations;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String directoryName = "out";
        String fileName = "summary.csv";
        String nome;
        double precoUnitario;
        int quantidade, opcao = 1;

        boolean existe = criaBancoDados(directoryName, fileName);

        if(!existe) {
            FileOperations.cabecalhoArquivo(directoryName, fileName);
        }

        while (opcao != 0) {

            System.out.println("nome do produto");
            nome = input.nextLine();
            System.out.println("preco do produto");
            precoUnitario = input.nextDouble();
            System.out.println("quantidade do produto");
            quantidade = input.nextInt();

            Produto produto = new Produto(nome, precoUnitario, quantidade);

            double precoTotal = produto.calculaTotal();
            String dados = returnString(produto, precoTotal);

            FileOperations.escreveNoArquivo(directoryName, fileName, dados);

            System.out.println("deseja continuar? se nao, aperte 0)");
            opcao = input.nextInt();
            input.nextLine();
        }
    }

    public static boolean criaBancoDados(String directoryName, String fileName) throws IOException
    {
        boolean existe;
        FileOperations.criaDiretorio(directoryName);
        existe = FileOperations.criaArquivo(directoryName, fileName);
        return existe;
    }

    public static String returnString(Produto produto, double precoTotal)
    {
        String total = DoubleOperations.doubleToString(precoTotal);
        String resultStr =  produto.getNome() + "," + produto.getPrecoUnitario() + "," + produto.getQuantidade() + "," + total;

        return resultStr;
    }
}
