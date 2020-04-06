package Aula.ExJKP;

/**
 * Jogada
 */
public class Jogada {

    private String escolha, ganhoDe, percoDe;


    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";
    // construtor de jogada
    public Jogada(String opcao) {
        if(opcao.equals(Jogada.PEDRA)) {
            ganhoDe = Jogada.TESOURA;
            percoDe = Jogada.PAPEL;
        }else if (opcao.equals(Jogada.PAPEL)) {
            ganhoDe = Jogada.PEDRA;
            percoDe = Jogada.TESOURA;
        } else {
            ganhoDe = Jogada.PAPEL;
            percoDe = Jogada.PEDRA;
        }
        
        escolha = opcao;
    }

    public String getEscolha(){
        return this.escolha;
    }

    public String avaliar(Jogada jogada){
        if (jogada.getEscolha().equals(this.ganhoDe)){
            return "Ganhei";
    } else if (jogada.getEscolha().equals(this.percoDe)){
        return "Perdi";
    } else{
        return "Empatei";
    }
    
}}