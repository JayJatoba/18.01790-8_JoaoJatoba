import java.util.ArrayList;
import java.util.Scanner;

import br.maua.Noh_Raiz;
import br.maua.Nohs;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Nohs> nohs = new ArrayList<>();
        Noh_Raiz raiz =  new Noh_Raiz(7, 0);

        Nohs no1 = new Nohs(1);
        Nohs no2 = new Nohs(2);
        Nohs no3 = new Nohs(3);
        Nohs no4 = new Nohs(4);
        Nohs no5 = new Nohs(5);
        Nohs no6 = new Nohs(6);

        raiz.noh_raiz.noh_esquerda=no1;
        raiz.noh_raiz.noh_direita=no2;
        no1.noh_pai=raiz.noh_raiz;
        no2.noh_pai=raiz.noh_raiz;

        no2.noh_esquerda=no3;
        no2.noh_direita=no4;
        no3.noh_pai=no2;
        no4.noh_pai=no2;

        no3.noh_esquerda=no5;
        no3.noh_direita=no6;
        no5.noh_pai=no3;
        no6.noh_pai=no3;

        nohs.add(raiz.noh_raiz);
        nohs.add(no1);
        nohs.add(no2);
        nohs.add(no3);
        nohs.add(no4);
        nohs.add(no5);
        nohs.add(no6);

        System.out.println("Questao 2-)\n*** Pre Order ***\n");
        Nohs.preOrder(raiz.noh_raiz);
        System.out.println("\n*** Pos Order ***\n");
        Nohs.posOrder(raiz.noh_raiz);
        System.out.println("\n*** In Order ***\n");
        Nohs.inOrder(raiz.noh_raiz);

        System.out.println("\nQuestao 3-)");
        System.out.println(procuraValor(nohs));


        System.out.println("\nQuestao 4-)");
        System.out.println(maiorValor(nohs));

        System.out.println("\nQuestao 5-)");
        System.out.println(menorValor(nohs));

        System.out.println("\nQuestao 6-)");
        System.out.println(mediaValor(nohs));

        System.out.println("\nQuestao 7-)");
        System.out.println("Quantidade de nulls: "+quantidadesNulls(nohs));

        System.out.println("\nQuestao 8-)");
        System.out.println("Quantidade de nohs: "+quantidadesNohs(nohs));

        System.out.println("\nQuestao 9-)");
        System.out.println("Quantidade de nohs folhas: "+quantidadesFolhas(nohs));

        System.out.println("\nQuestao 10-)");
        System.out.println("Altura da arvore: "+alturaArvore(raiz.noh_raiz));

    }
    public static String procuraValor(ArrayList<Nohs> lista){
        System.out.println("Qual o valor que voce quer procurar?");
        Scanner sc = new Scanner(System.in);
        int valor = Integer.parseInt(sc.nextLine());
        
        for (Nohs nohs : lista) {
            if(nohs.getItem()==valor){
                return "Valor encontrado com sucesso.";
            }
        }
        
        return "Valor nao encontrado";
    }

    public static String maiorValor(ArrayList<Nohs> lista){
        int valor = lista.get(0).getItem();
        for (Nohs nohs : lista) {
            if(nohs.getItem()>valor){
                valor = nohs.getItem();
            }
        }
        return "Maior valor: "+valor;
    }

    public static String menorValor(ArrayList<Nohs> lista){
        int valor = lista.get(0).getItem();
        for (Nohs nohs : lista) {
            if(nohs.getItem()<valor){
                valor = nohs.getItem();
            }
        }
        return "Menor valor: "+valor;
    }

    public static String mediaValor(ArrayList<Nohs> lista){
        int valor=0;
        for (Nohs nohs : lista) {
            valor+=nohs.getItem();
        }
        return "Media valor: "+valor/lista.size();
    }

    public static int quantidadesNulls(ArrayList<Nohs> lista){
        int totalNulls=0;
        for (Nohs nohs : lista) {
            if (nohs.noh_direita==null) {
                totalNulls++;
            }
            if (nohs.noh_esquerda==null) {
                totalNulls++;
            }
            if (nohs.noh_pai==null) {
                totalNulls++;
            }
        }
        return totalNulls;
    }


    public static int quantidadesNohs(ArrayList<Nohs> lista){
        return lista.size();
    }

    public static int quantidadesFolhas(ArrayList<Nohs> lista){
        int totalFolhas=0;
        for (Nohs nohs : lista) {
            if (!(Nohs.ehDireito(nohs) && Nohs.ehEsquerdo(nohs))) {
                totalFolhas++;
            }
        }
        
        return totalFolhas;
    }

    public static int alturaArvore(Nohs ponteiro){
        
        if (ponteiro.noh_esquerda == null){
            return 0;
        }
        else{
            int altEsq = alturaArvore(ponteiro.noh_esquerda);
            int altDir = alturaArvore(ponteiro.noh_direita);

            if(altEsq>altDir)
                return altEsq+1;
            return altDir + 1;
        }
    }
}
