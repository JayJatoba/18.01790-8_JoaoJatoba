package br.maua.implementacoes.projeto.parsers;

import org.json.JSONObject;

import br.maua.implementacoes.projeto.model.Jogo;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
        JSONObject json = new JSONObject();
        json.put("plataforma", jogo.getPlataforma());
        json.put("nome", jogo.getNome());
        json.put("status", jogo.getStatus());
        return json;
    }

    public static Jogo fromJson(JSONObject json){
        Jogo jogo = new Jogo(json.getString("plataforma"),json.getString("nome"));
        jogo.setStatus(StatusParser.toStatus(json.getString("status")));
        return jogo;
    }
}