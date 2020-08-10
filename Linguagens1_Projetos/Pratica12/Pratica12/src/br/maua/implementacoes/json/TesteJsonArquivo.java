package br.maua.implementacoes.json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.json.JSONArray;

import br.maua.implementacoes.projeto.model.Jogo;
import br.maua.implementacoes.projeto.model.ListaDeJogos;
import br.maua.implementacoes.projeto.parsers.ListaDeJogosParser;

public class TesteJsonArquivo {
    public static void main(String[] args) {
        ListaDeJogos lista = new ListaDeJogos();
        lista.addJogo(new Jogo("PC", "Minecraft"));
        lista.addJogo(new Jogo("PC", "Cyberpunk"));
        lista.addJogo(new Jogo("PC", "CS:Go"));
        lista.addJogo(new Jogo("PC", "Terraria"));
        lista.addJogo(new Jogo("PS4", "God of War"));
        lista.addJogo(new Jogo("PS4", "The Last of Us"));
        lista.addJogo(new Jogo("PS4", "ghost of tsushima"));

        JSONArray json = ListaDeJogosParser.toJson(lista);
        escreverArquivo("jogos.json", json);
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