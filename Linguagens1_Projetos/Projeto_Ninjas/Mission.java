import java.util.ArrayList;
import java.util.Scanner;

public class Mission {
    protected String descricao;
    protected String local;
    protected String objetivo;

    public static String escolhaMissao() {
        String opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a classe da missao a ser distribuida? [S,A,B,C,D]");
        opcao = sc.nextLine().toUpperCase();
        while (!(opcao.equals("S") || opcao.equals("A") || opcao.equals("B") || opcao.equals("C") || opcao.equals("D"))){
            System.out.println("Classes de missao possiveis: S, A, B, C, D.");
            opcao = sc.nextLine().toUpperCase();
        }
        
        return opcao;
    }

    public void createMission(ArrayList<String> mission) {
        Scanner sc = new Scanner(System.in);
        mission.add(escolhaMissao());
        System.out.println("Qual a missão?");
        mission.add(sc.nextLine());
        System.out.println("Qual o local?");
        mission.add(sc.nextLine());
        System.out.println("Qual o objetivo?");
        mission.add(sc.nextLine());
        
    }

    public String[] getMission(String opcao){
        String[] mission = new String[4];
        if (opcao.equals("S")){

        }else if(opcao.equals("A")){

        }else if(opcao.equals("B")){

        }else if (opcao.equals("C")){

        }else{
            descricao = "Pegar o gato.";
            local = "Vila de Konoha.";
            objetivo = "Criar amizade com membros da vila.";
            mission[1] = descricao;
            mission[2] = local;
            mission[3] = objetivo;
        }
        return mission;
    }
    
    
}