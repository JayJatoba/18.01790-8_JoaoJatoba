package br.maua.projeto.parsers;

import org.json.JSONArray;

import br.maua.projeto.model.ListaDeJogos;

public class ListaDeJogosParser {
    public static JSONArray toJson(ListaDeJogos lista){
        JSONArray json = new JSONArray();
        lista.getJogos().forEach(jogo->{
            json.put(jogo);
        }
        );
        return json;
    }

    public static ListaDeJogos fromJson(JSONArray json){
        
    }
}