package ExJKP;

import java.util.Scanner;

/**
 * JoKenPo
 */
public class Jkp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha, jogar;
        Player p1, p2;

        Jogo game;
        game = new Jogo();

        jogar = "S";

        System.out.println("Bem vindo ao jogo de JoKemPo.\n\n");
        System.out.println("Regras do jogo normal: ");
        System.out.println("Pedra bate tesoura\nTesoura bate papel\nPapel bate pedra");
        System.out.println("\n\n\nRegras do jogo JKPSL: ");
        System.out.println("Scissors cuts Paper\nPaper covers Rock\nRock crushes Lizard");
        System.out.println("Lizard poisons Spock\nSpock smashes Scissors\nScissors decapitate Lizard");
        System.out.println("Lizard eats Paper\nPaper disproves Spock\nSpock vaporizes Rock\nRock crushes Scissors.");
        

        while (jogar.equals("S")){
            System.out.println("\n\nVoces querem jogar o normal(Normal) ou o JKPSL(Spock)?");
            escolha = sc.nextLine().toUpperCase();

            if (escolha.equals("NORMAL") || escolha.equals("SPOCK")){
                game.Principal(escolha);
            } 
            
            else {
                System.out.println("Voce quer realmente jogar? (S/N)");
                jogar = sc.nextLine().toUpperCase();
            }
        }
        
    }
    
    
}