package br.maua.implementacoes.serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteSerializar {
    public static void main(String[] args) {
        System.out.println("Teste de serialização");

        Pessoa p1 = new Pessoa("Jay", 20);
        Pessoa p2 = new Pessoa("Itachi", 25);

        System.out.println("Pessoas: "+p1 + p2);

        try{
        // Cria uma forma de escrever arquivos no S.O.
        FileOutputStream fileOutputStream = new FileOutputStream("ecm251.maua");
        //Cria objeto que faz a conversao em bytes dos objetos
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);


        //Escreve os objetos no arquivo
        outputStream.writeObject(p1);
        outputStream.writeObject(p2);

        //Fechar os fluxos
        outputStream.close();
        fileOutputStream.close();
    }
        catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }

        System.out.println("Objetos salvos.");
}
}