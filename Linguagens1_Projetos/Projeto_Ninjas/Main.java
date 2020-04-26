
public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        ninja.train();
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        academicStudent.train();
        Chuunin chuunin = new Chuunin("Iruka", "Umino", "Treinar XYZ");
        chuunin.train();
        chuunin.gotoMission();
        Ninja jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke!");
        jounin.train();
        ((Jounin) jounin).gotoMission();
        mostrarTreino(jounin);
    }

    static void mostrarTreino(Ninja ninja){
        ninja.train();
    }
}