import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Mission {
    protected ArrayList<ArrayList<String>> allmissions;
    protected String rank;
    protected String descricao;
    protected String local;
    protected String objetivo;

    public Mission(ArrayList<ArrayList<String>> allmissions){
        this.allmissions = allmissions;
    }

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

    public ArrayList<String> getMission() {
        ArrayList<String> mission;
        Random rand1 = new Random();
        mission = allmissions.get(rand1.nextInt(allmissions.size()));
        return mission;
    }
    
    
}