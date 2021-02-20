package ExJKP;

/**
 * Spock
 */
public class Spock {

    public Player player;
    

    boolean Empate(Player pri, Player seg){
        
        if(pri.jogada.equals(seg.jogada)){
            return true;
        }
        else 
            return false;
    }

    void Vitoria(Player pri, Player seg){
        // Jogador 1 vence a rodada
        if (pri.jogada.equals("PEDRA") && (seg.jogada.equals("TESOURA") || seg.jogada.equals("LIZARD"))){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        }else if (pri.jogada.equals("PAPEL") && (seg.jogada.equals("PEDRA") || seg.jogada.equals("SPOCK"))) {
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        } else if(pri.jogada.equals("TESOURA") && (seg.jogada.equals("PAPEL") || seg.jogada.equals("LIZARD"))){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        } else if(pri.jogada.equals("SPOCK") && (seg.jogada.equals("TESOURA") || seg.jogada.equals("PEDRA"))){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        } else if(pri.jogada.equals("LIZARD") && (seg.jogada.equals("PAPEL") || seg.jogada.equals("SPOCK"))){
            System.out.println("O jogador " + pri.nome + " ganhou." );
            pri.wins+=1;
            seg.loss+=1;
        }
        
        // Jogador 2 vence a rodada
        else if((pri.jogada.equals("PAPEL") || pri.jogada.equals("LIZARD")) && seg.jogada.equals("TESOURA")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        } else if((pri.jogada.equals("TESOURA") || pri.jogada.equals("LIZARD")) && seg.jogada.equals("PEDRA")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }else if((pri.jogada.equals("PEDRA") || pri.jogada.equals("SPOCK")) && seg.jogada.equals("PAPEL")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }else if((pri.jogada.equals("PEDRA") || pri.jogada.equals("TESOURA")) && seg.jogada.equals("SPOCK")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }else if((pri.jogada.equals("Papel") || pri.jogada.equals("SPOCK")) && seg.jogada.equals("LIZARD")){
            System.out.println("O jogador " + seg.nome + " ganhou." );
            seg.wins+=1;
            pri.loss+=1;
        }

    }
    

}