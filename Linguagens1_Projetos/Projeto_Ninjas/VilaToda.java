import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class VilaToda {
    public void todaVila(){
        // Cada rank de missao tem uma propria lista de missoes
        Mission rankSmission = new Mission(Smissions);
        Mission rankAmission = new Mission(Amissions);
        Mission rankBmission = new Mission(Bmissions);
        Mission rankCmission = new Mission(Cmissions);
        Mission rankDmission = new Mission(Dmissions);
        

        criarMissions(rankSmission,rankAmission,rankBmission,rankCmission,rankDmission);  
        


        // Criar todas as missoes para um "banco de dados"
        while(criarVariasMissoes()){
            String opcao = opcoesMissao();

            if (opcao.equals("S")){
                rankSmission.createMission();
            }else if (opcao.equals("A")){
                rankAmission.createMission();
            }else if (opcao.equals("B")){
                rankBmission.createMission();
            }else if (opcao.equals("C")){
                rankCmission.createMission();
            }else{
                rankDmission.createMission();
            }
        }

        String atividadeJounin, atividadeChuunin;
        atividadeJounin = rankSmission.getRandomMission().get(1);
        atividadeChuunin = rankAmission.getRandomMission().get(1);


        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        mostrarTreino(ninja);
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chuunin chuunin = new Chuunin("Iruka", "Umino", atividadeChuunin);
        mostrarTreino(chuunin);
        chuunin.gotoMission();
        Ninja jounin = new Jounin("Kakashi", "Hatake", atividadeJounin);
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

    static String opcoesMissao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual classe de missão a ser criada ou distribuída?");
        System.out.println("[S,A,B,C,D]");

        String opcao = sc.nextLine().toUpperCase();
        while(!(opcao.equals("S") || opcao.equals("A") || opcao.equals("B") || opcao.equals("C") || opcao.equals("D"))){
            System.out.println("Classes possíveis: [S,A,B,C,D]");
            opcao = sc.nextLine().toUpperCase();
        }
        return opcao;
    }

    // static String distribuiMiss(){}
    static Boolean criarVariasMissoes(){
        System.out.println("Quer criar alguma missao? [S,N]");
        Scanner sc = new Scanner(System.in);
        String continuar = sc.nextLine().toUpperCase();
        while(!(continuar.equals("S") || continuar.equals("N"))){
            System.out.println("S ou N?");
            continuar = sc.nextLine().toUpperCase();
        }
        if (continuar.equals("N")){
            return false;
        }
        return true;

        
    }
    

}