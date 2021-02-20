package br.maua.implementacoes.json;

import org.json.JSONObject;

import br.maua.projeto.model.Jogo;
import br.maua.projeto.parsers.JogoParser;

public class TesteJson {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC", "Cyberpunk");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString:" + jogo1);
        System.out.println("----------------------");
        System.out.println("Formato JSON:" + json);
        Jogo jogo2 = JogoParser.fromJson(json);
        System.out.println("Jogo 2:"+jogo2);
    }
}