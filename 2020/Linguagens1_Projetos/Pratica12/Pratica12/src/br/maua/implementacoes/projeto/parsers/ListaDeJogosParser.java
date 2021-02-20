package br.maua.implementacoes.projeto.parsers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.maua.implementacoes.projeto.model.Jogo;
import br.maua.implementacoes.projeto.model.ListaDeJogos;

public class ListaDeJogosParser {
    public static JSONArray toJson(ListaDeJogos lista){
        JSONArray json = new JSONArray();
        lista.getJogos().forEach( jogo -> {
            json.put(JogoParser.toJson(jogo));
        });
        return json;
    }
    public static ListaDeJogos fromJson(JSONArray json){
        ListaDeJogos lista = new ListaDeJogos();
        json.forEach( item ->{
            lista.addJogo(JogoParser.fromJson((JSONObject) item));
        });
        return lista;
    }
}