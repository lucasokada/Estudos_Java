package com.br.file;

import java.io.*;

public class FileOperations {

    public static void criaDiretorio(String directoryName)
    {
        File directory = new File("/home/lucas/Desktop/" + directoryName);

        if(directory.mkdir()){
            System.out.println("diretorio criado");
        }else{
            System.out.println("diretorio existente");
        }
    }

    public static boolean criaArquivo(String directoryName ,String fileName) throws IOException
    {
        File file = new File("/home/lucas/Desktop/" + directoryName + "/" + fileName);
        boolean existe;

        if(file.createNewFile()){
            System.out.println("arquivo criado com sucesso");
            existe = false;
        }else{
            System.out.println("o arquivo ja existe");
            existe = true;
        }

        return existe;
    }

    public static void cabecalhoArquivo(String directoryName ,String fileName) throws IOException
    {
        String cabecalho = "nome do produto, preco unitario, quantidade, preco total";
        String path = "/home/lucas/Desktop/" + directoryName + "/" + fileName;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(cabecalho);
            bw.newLine();
        }
    }

    public static void escreveNoArquivo(String directoryName ,String fileName, String dados) throws IOException
    {
        String path = "/home/lucas/Desktop/" + directoryName + "/" + fileName;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(dados);
            bw.newLine();
        }
    }
}
