package br.maua.implementacoes.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TesteEscrita {
    public static void main(String[] args) {
        //Cria um arquivo
        File file = new File("nome.txt");
        try{

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("Ola Mundo arquivos!");
            bufferedWriter.write("\nLala 2 + 2 =" + (2+2));
            bufferedWriter.write("\nVegeta é o Cara!");

            //Força escrita na hora
            //bufferedWriter.flush();

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();

        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}