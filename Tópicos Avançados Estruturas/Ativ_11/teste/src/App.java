import br.maua.Noh_Raiz;
import br.maua.Nohs;

public class App {
    public static int soma;
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
        no2.noh_pai=raiz.noh_raiz;

        no1.noh_prime_filho=no3;
        no3.noh_proximo=no4;
        no4.noh_proximo=no5;
        no3.noh_pai=no1;
        no4.noh_pai=no1;
        no5.noh_pai=no1;

        no4.noh_prime_filho=no8;
        no8.noh_proximo=no9;
        no9.noh_proximo=no10;
        no8.noh_pai=no4;
        no9.noh_pai=no4;
        no10.noh_pai=no4;

        no5.noh_prime_filho=no11;
        no11.noh_proximo=no12;
        no12.noh_proximo=no13;
        no11.noh_pai=no5;
        no12.noh_pai=no5;
        no13.noh_pai=no5;

        no2.noh_prime_filho=no6;
        no6.noh_proximo=no7;
        no6.noh_pai=no2;
        no7.noh_pai=no2;

        no7.noh_prime_filho=no14;
        no14.noh_proximo=no15;
        no14.noh_pai=no7;
        no15.noh_pai=no7;

        no14.noh_prime_filho=no16;
        no16.noh_proximo=no17;
        no16.noh_pai=no14;
        no17.noh_pai=no14;

        no15.noh_prime_filho=no18;
        no18.noh_pai=no15;

        somaMemoria(no2, no2);
        somaMemoria(no1, no1);
        somaMemoria(raiz.noh_raiz, raiz.noh_raiz);


    }
    public static void somaMemoria(Nohs ponteiro,Nohs original){
        Nohs aux = ponteiro.noh_prime_filho;
        while(aux!=null){
            somaMemoria(aux,original);
            aux=aux.noh_proximo;
        }
        soma=soma + ponteiro.getMemoria();
        if (ponteiro==original){
            System.out.println("\n**** Funcao somaMemoria *****");
            System.out.println("Diretorio: "+original.getDiretorio()+"\nTotal = "+soma+" Kbytes");
            soma=0;
        }
    }
}
