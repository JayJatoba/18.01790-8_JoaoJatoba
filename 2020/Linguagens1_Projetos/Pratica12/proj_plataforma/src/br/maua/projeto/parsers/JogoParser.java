package br.maua.projeto.parsers;

import org.json.JSONObject;

import br.maua.projeto.model.Jogo;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
        JSONObject json = new JSONObject();
        json.put("plataforma", jogo.getPlataforma());
        json.put("nome", jogo.getNome());
        json.put("status", jogo.getStatus());
        return json;
    }

    public static Jogo fromJson(JSONObject item){
        Jogo jogo = new Jogo(
            item.getString("plataforma"),
            item.getString("nome")
        );
        jogo.setStatus(
            StatusParser.toStatus(item.getString("status"))
        );

        return jogo;

    }
}