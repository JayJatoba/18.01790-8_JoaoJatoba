package ExJKP;

import java.util.Scanner;


/**
 * Normal
 */
public class Normal {
    public Player player;
    

    boolean Empate(Player pri, Player seg){
        
        if(pri.jogada.equals(seg.jogada)){
            return true;
        }
        else 
            return false;
    }

    void Vitoria(Player pri, Player seg){
        
        if (pri.jogada.equals("PEDRA") && seg.jogada.equals("TESOURA")){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        }else if (pri.jogada.equals("PAPEL") && seg.jogada.equals("PEDRA")) {
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        } else if(pri.jogada.equals("TESOURA") && seg.jogada.equals("PAPEL")){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        }
        
        else if(pri.jogada.equals("PAPEL") && seg.jogada.equals("TESOURA")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        } else if(pri.jogada.equals("TESOURA") && seg.jogada.equals("PEDRA")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }else{
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }

    }
    

}