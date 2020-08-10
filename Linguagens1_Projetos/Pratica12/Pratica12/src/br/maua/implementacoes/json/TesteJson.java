package br.maua.implementacoes.json;

import org.json.JSONObject;

import br.maua.implementacoes.projeto.model.Jogo;
import br.maua.implementacoes.projeto.parsers.JogoParser;

/**
 * TesteJson
 */
public class TesteJson {

    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC", "Cyberpunk");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString: " + jogo1);
        System.out.println("----------------------");
        System.out.println("Formato JSON:" + json);
    }
}