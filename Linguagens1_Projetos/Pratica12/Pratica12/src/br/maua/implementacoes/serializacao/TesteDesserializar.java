package br.maua.implementacoes.serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TesteDesserializar implements Serializable{
    public static void main(String[] args) {
        Pessoa p1, p2;

        try{
            //
            FileInputStream fileInputStream=new FileInputStream("ecm251.maua");
            //Acessa os dados do arquivo
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //Ler os objetos do arquivo
            p1 = (Pessoa) objectInputStream.readObject();
            p2 = (Pessoa) objectInputStream.readObject();

            System.out.println("Pessoas: " + p1+p2);

            // Fecha os fluxos
            objectInputStream.close();
            fileInputStream.close();
        } catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}