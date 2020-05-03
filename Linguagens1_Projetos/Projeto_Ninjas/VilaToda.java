import java.util.ArrayList;
import java.util.Random;

public class VilaToda {
    public void todaVila(){
        Mission rankSmission = new Mission(Smissions);
        Mission rankAmission = new Mission(Amissions);
        Mission rankBmission = new Mission(Bmissions);
        Mission rankCmission = new Mission(Cmissions);
        Mission rankDmission = new Mission(Dmissions);

        criarMissions(rankSmission,rankAmission,rankBmission,rankCmission,rankDmission);  
        rankSmission.createMission();
        String atividade;
        atividade = rankSmission.getMission().get(1);



        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        mostrarTreino(ninja);
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chuunin chuunin = new Chuunin("Iruka", "Umino", "Treinar XYZ");
        mostrarTreino(chuunin);
        chuunin.gotoMission();
        Ninja jounin = new Jounin("Kakashi", "Hatake", atividade);
        mostrarTreino(jounin);
    }
    
    
    
    static void mostrarTreino(Ninja ninja) {
        ninja.train();
    }
    

    // static String posso(SpecialJounin specialJounin){
    //     Random rand = new Random();
    //     String mission;
    //     return mission;
    // }
    // static String posso(Jounin jounin){
    //     Random rand = new Random();
    //     String mission;
    //     return mission;
    // }
    
    // static String posso(Chuunin chuunin){
    //     Random rand = new Random();
    //     String mission;
    //     return mission;
    // }

    // static String posso(Genin genin){
    //     Random rand = new Random();
    //     String mission;
    //     return mission;
        
    // }





    
        static ArrayList<ArrayList<String>> Smissions = new ArrayList<>();
        static ArrayList<ArrayList<String>> Amissions = new ArrayList<>();
        static ArrayList<ArrayList<String>> Bmissions = new ArrayList<>();
        static ArrayList<ArrayList<String>> Cmissions = new ArrayList<>();
        static ArrayList<ArrayList<String>> Dmissions = new ArrayList<>();
        static ArrayList<Mission> missions = new ArrayList<>();

        static void criarMissions(Mission rankSmission, Mission rankAmission, Mission rankBmission, Mission rankCmission, Mission rankDmission){
        rankSmission.rank = "S";
        rankAmission.rank = "A";
        rankBmission.rank = "B";
        rankCmission.rank = "C";
        rankDmission.rank = "D";
        
        missions.add(rankSmission);
        missions.add(rankAmission);
        missions.add(rankBmission);
        missions.add(rankCmission);
        missions.add(rankDmission);
    }

}