package ExJKP;

import java.util.Scanner;


/**
 * Game
 */
public class Jogo {
    public static void main(String[] args) {
        
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
        
        p1.player.Jogada();
        p2.player.Jogada();

        if (jogo.Empate(p1.player, p2.player)) {
            System.out.println("O jogo foi empate.");
        }
        else{
            jogo.Vitoria(p1.player, p2.player);
        }
    }
}