package ExJKP;

import java.util.Scanner;

/**
 * Player1
 */
public class Player {

    public String nome, jogada;
    public int wins, loss;
	public Player player;
	

    void Nome(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        this.nome = sc.nextLine();
    }

    void Jogada(String escolha){
        if(escolha.equals("NORMAL")){
        System.out.println("Digite a jogada de " + this.nome + "(pedra/ papel/ tesoura): ");
        Scanner sc  = new Scanner(System.in);
        this.jogada = sc.nextLine().toUpperCase();
        while (!(this.jogada.equals("PEDRA") || this.jogada.equals("TESOURA") || this.jogada.equals("PAPEL") )) {
            System.out.println("Joga direito: ");
            this.jogada = sc.nextLine().toUpperCase();
        } }

        else{
            System.out.println("Digite a jogada de " + this.nome + "(pedra/ papel/ tesoura/ lizard/ spock): ");
            Scanner sc  = new Scanner(System.in);
            this.jogada = sc.nextLine().toUpperCase();
            while (!(this.jogada.equals("PEDRA") || this.jogada.equals("TESOURA") || this.jogada.equals("PAPEL") || this.jogada.equals("LIZARD") || this.jogada.equals("SPOCK") )) {
                System.out.println("Joga direito: ");
                this.jogada = sc.nextLine().toUpperCase();
        } 
        }
        
        
    }

}