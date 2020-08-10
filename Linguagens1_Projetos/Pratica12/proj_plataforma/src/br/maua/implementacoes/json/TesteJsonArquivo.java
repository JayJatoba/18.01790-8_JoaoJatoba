package br.maua.implementacoes.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;

import org.json.JSONArray;

import br.maua.projeto.parsers.ListaDeJogosParser;
import br.maua.projeto.model.Jogo;
import br.maua.projeto.model.ListaDeJogos;

public class TesteJsonArquivo {
    public static void main(String[] args) {
    //    ListaDeJogos lista = new ListaDeJogos();
    //    lista.addJogo(new Jogo("PC", "Minecraft"));
    //    lista.addJogo(new Jogo("PC", "Cyberpunk"));
    //    lista.addJogo(new Jogo("PC", "CS:Go"));
    //    lista.addJogo(new Jogo("PC", "Terraria"));
    //    lista.addJogo(new Jogo("PS4", "God of War"));
    //    lista.addJogo(new Jogo("PS4", "The Last of Us"));
    //    lista.addJogo(new Jogo("PS4", "ghost of tsushima"));

    //    JSONArray json = ListaDeJogosParser.toJson(lista);
    //    escreverArquivo("jogos.json", json);
        ListaDeJogos lista = ListaDeJogosParser.fromJson(lerArquivo("jogos.json"));
        System.out.println("Lista Carregada:");
        System.out.println("" + lista);
    }

    private static JSONArray lerArquivo(String nomeArquivo) {
        JSONArray json = null;
        File file = new File(nomeArquivo);
        try{
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            json = new JSONArray (bufferedReader.readLine());

            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();

        }catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
        return json;
    }

    private static void escreverArquivo(String nomeArquivo, JSONArray json) {
        //Cria um arquivo
        File file = new File(nomeArquivo);
        try{

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("" + json);

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