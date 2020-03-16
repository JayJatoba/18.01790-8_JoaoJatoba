package ExJKP;

import java.util.Scanner;

/**
 * SpPlayer
 */
public class SpPlayer {

    public String nome, jogada;
    public int wins, loss;

    void SpNome(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        this.nome = sc.nextLine();
    }

    void SpJogada(){
        
        System.out.println("Digite a jogada de " + this.nome + ": ");
            Scanner sc  = new Scanner(System.in);
            this.jogada = sc.nextLine().toUpperCase();
            while (!(this.jogada.equals("PEDRA") || this.jogada.equals("TESOURA") || this.jogada.equals("PAPEL") || this.jogada.equals("LIZARD") || this.jogada.equals("SPOCK") )) {
                System.out.println("Joga direito: ");
                this.jogada = sc.nextLine().toUpperCase();
        } 
    }

}