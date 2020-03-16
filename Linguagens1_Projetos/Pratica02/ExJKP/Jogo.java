package ExJKP;

import java.util.Scanner;


/**
 * Game
 */
public class Jogo {
    void Sgame(String escolha) {
        
        // Declaracao das variaveis jogadores
        Spock p1, p2,jogo;
        p1 = new Spock();
        p2 = new Spock();
        jogo = new Spock();
        p1.player = new Player();
        p2.player = new Player();

        // Pede o nome dos jogadores
        p1.player.Nome();
        p2.player.Nome();
        
        p1.player.Jogada(escolha);
        p2.player.Jogada(escolha);

        if (jogo.Empate(p1.player, p2.player)) {
            System.out.println("O jogo foi empate.");
        }
        else{
            jogo.Vitoria(p1.player, p2.player);
        }
    }

    void Ngame(String escolha){
        // Declaracao das variaveis jogadores
        Normal p1, p2,jogo;
        p1 = new Normal();
        p2 = new Normal();
        jogo = new Normal();
        p1.player = new Player();
        p2.player = new Player();

        // Pede o nome dos jogadores
        p1.player.Nome();
        p2.player.Nome();
        
        p1.player.Jogada(escolha);
        p2.player.Jogada(escolha);

        if (jogo.Empate(p1.player, p2.player)) {
            System.out.println("O jogo foi empate.");
        }
        else{
            jogo.Vitoria(p1.player, p2.player);
        }
    }

    void Principal(String escolha){
        Jogo game;
        game = new Jogo();
        
        if (escolha.equals("NORMAL") ){
            game.Ngame(escolha);
        } 
        else if (escolha.equals("SPOCK")){
            game.Sgame(escolha);
        }

    }

}