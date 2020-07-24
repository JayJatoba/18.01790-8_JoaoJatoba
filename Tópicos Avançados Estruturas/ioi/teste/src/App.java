import br.maua.Noh_Raiz;
import br.maua.Nohs;

public class App {
    public static void main(String[] args) throws Exception {
        

        Noh_Raiz raiz =  new Noh_Raiz(19, 0, "/users/rt/cursos", 1);
        Nohs no1 = new Nohs(1, "/java/", 2);
        Nohs no2 = new Nohs(2, "/ruby/", 1);
        Nohs no3 = new Nohs(3, "Grades1", 8);
        Nohs no4 = new Nohs(4, "Slides/", 2);
        Nohs no5 = new Nohs(5, "Exercicios/", 1);
        Nohs no6 = new Nohs(6, "Grades2", 5);
        Nohs no7 = new Nohs(7, "Projetos/", 1);
        Nohs no8 = new Nohs(8, "Slide01", 3);
        Nohs no9 = new Nohs(9, "Slide02", 2);
        Nohs no10 = new Nohs(10, "Slide03", 4);
        Nohs no11 = new Nohs(11, "Exerc01", 3);
        Nohs no12 = new Nohs(12, "Exerc02", 2);
        Nohs no13 = new Nohs(13, "Exerc03", 4);
        Nohs no14 = new Nohs(14, "Papers/", 2);
        Nohs no15 = new Nohs(15, "Demos/", 1);
        Nohs no16 = new Nohs(16, "Thread", 9);
        Nohs no17 = new Nohs(17, "Buy", 8);
        Nohs no18 = new Nohs(18, "Market", 7);


        raiz.noh_raiz.noh_prime_filho=no1;

        no1.noh_proximo=no2;
        no1.noh_pai=raiz.noh_raiz;
        no1.noh_pai=raiz.noh_raiz;

        


    }
}
