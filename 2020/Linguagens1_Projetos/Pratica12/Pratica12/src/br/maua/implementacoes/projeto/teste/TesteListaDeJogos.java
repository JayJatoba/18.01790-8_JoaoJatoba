package br.maua.implementacoes.projeto.teste;

import br.maua.implementacoes.projeto.model.Jogo;
import br.maua.implementacoes.projeto.model.ListaDeJogos;

public class TesteListaDeJogos {
    public static void main(String[] args) {
        ListaDeJogos jogos = new ListaDeJogos();
        System.out.println("Lista atual: "+jogos);

        Jogo jogo1 = new Jogo("PC", "LoL");
        Jogo jogo2 = new Jogo("PC", "Diablo 3");
        Jogo jogo3 = new Jogo("PC", "Halo");

        jogos.addJogo(jogo1);
        jogos.addJogo(jogo2);
        jogos.addJogo(jogo3);

        System.out.println(jogos);
    }
}