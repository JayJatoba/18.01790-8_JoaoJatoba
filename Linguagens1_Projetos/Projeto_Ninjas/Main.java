import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Smissions = new ArrayList<>();
        ArrayList<String> Amissions = new ArrayList<>();
        ArrayList<String> Bmissions = new ArrayList<>();
        ArrayList<String> Cmissions = new ArrayList<>();
        ArrayList<String> Dmissions = new ArrayList<>();
        ArrayList<String> missions = new ArrayList<>();
        missions.addAll(Smissions);
        missions.addAll(Amissions);
        missions.addAll(Bmissions);
        missions.addAll(Cmissions);
        missions.addAll(Dmissions);

        ArrayList<String> varMission = new ArrayList<>();
        Mission missao = new Mission();
        missao.createMission(varMission);

        Smissions.addAll(varMission);
        System.out.println(Smissions.get(0));



        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        mostrarTreino(ninja);
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chuunin chuunin = new Chuunin("Iruka", "Umino", "Treinar XYZ");
        mostrarTreino(chuunin);
        chuunin.gotoMission();
        Ninja jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke!");
        mostrarTreino(jounin);
        
    }

    static void mostrarTreino(Ninja ninja) {
        ninja.train();
    }

    
}