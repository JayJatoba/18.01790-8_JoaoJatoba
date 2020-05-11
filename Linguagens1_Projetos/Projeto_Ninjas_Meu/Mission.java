import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Mission {
    // Esta allmissions eh onde serao guardadas arrays de string, que por sua vez terao strings em 
    //4 diferentes posicoes (em ordem: rank, descricao, local, objetivo)
    protected ArrayList<ArrayList<String>> allmissions;
    protected String rank;
    protected String descricao;
    protected String local;
    protected String objetivo;

    public Mission(ArrayList<ArrayList<String>> allmissions){
        this.allmissions = allmissions;
    }

    // public void getMissions(){}
    // public String getRank(){
    //     String qualRank;
    //     qualRank = allmissions.get(0).get(0);
    //     return qualRank;
    // }
    // public String getDescricao(){}
    // public String getLocal(){}
    // public String getObjetivo(){}

    // Quando quiser criar missoes, use este metodo
    public void createMission() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> mission = new ArrayList<>();
        mission.add(rank);
        System.out.println("Qual a missão?");
        mission.add(sc.nextLine());
        System.out.println("Qual o local?");
        mission.add(sc.nextLine());
        System.out.println("Qual o objetivo?");
        mission.add(sc.nextLine());


        allmissions.add(mission);
        
    }
    
    // Distribui randomicamente missoes
    // public String distMission(){
    //     String mission;
    //     Random rand1 = new Random();
        
    //     mission = allmissions.get(rand1.nextInt(allmissions.size()));
    //     return mission;
        
    // }
    

    // 
    public ArrayList<String> getRandomMission() {
        ArrayList<String> mission;
        Random rand1 = new Random();
        // Eh randomico a escolha da missao
        mission = allmissions.get(rand1.nextInt(allmissions.size()));
        // Essa missao eh array com rank, descricao, local e objetivo
        // O que se usa eh a descricao
        // O rank serve para diferenciar quem pega qual classe
        return mission;
    }
    
    
}