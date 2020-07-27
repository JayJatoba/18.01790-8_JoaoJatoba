import java.util.ArrayList;
import java.util.Scanner;

import br.maua.Noh_Raiz;
import br.maua.Nohs;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Noh_Raiz raiz =  new Noh_Raiz(6, 3);

        Nohs no7 = new Nohs(7);
        Nohs no8 = new Nohs(8);
        Nohs no9 = new Nohs(9);
        Nohs no10 = new Nohs(10);
        Nohs no5 = new Nohs(5);

        raiz.noh_raiz.noh_esquerda=no7;
        raiz.noh_raiz.noh_direita=no8;

        no7.noh_pai=raiz.noh_raiz;
        no8.noh_pai=raiz.noh_raiz;

        no7.noh_esquerda=no9;
        no7.noh_direita=no10;
        no9.noh_pai=no7;
        no10.noh_pai=no7;

        no8.noh_esquerda=no5;
        no5.noh_pai=no8;


        System.out.println("Por PreOrder: ");
        Nohs.preOrder(raiz.noh_raiz);
        System.out.println("\nPor PostOrder: ");
        Nohs.posOrder(raiz.noh_raiz);
        System.out.println("Por InOrder: ");
        Nohs.inOrder(raiz.noh_raiz);
        System.out.println("Valor max = "+maiorValor(raiz.noh_raiz));
        System.out.println("Valor min = "+menorValor(raiz.noh_raiz));
        System.out.println("Quantidade nos = "+quantidadesNohs(raiz.noh_raiz));
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

    public static int maiorValor(Nohs node){
        if (node == null)
            return Integer.MIN_VALUE;
        int valor = node.getItem();
        int valorEsq=maiorValor(node.noh_esquerda);
        int valorDir=maiorValor(node.noh_direita);

        if (valorEsq>valor)
            valor = valorEsq;
        if(valorDir>valor)
            valor = valorDir;
        
        return valor;
    }

    public static int menorValor(Nohs node){
        if (node == null)
            return Integer.MAX_VALUE;
        int valor = node.getItem();
        int valorEsq=menorValor(node.noh_esquerda);
        int valorDir=menorValor(node.noh_direita);

        if (valorEsq<valor)
            valor = valorEsq;
        if(valorDir<valor)
            valor = valorDir;
        
        return valor;
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


    public static int quantidadesNohs(Nohs node){
        if (node == null)
            return 1;
        
        int valorEsq=quantidadesNohs(node.noh_esquerda);
        int valorDir=quantidadesNohs(node.noh_direita);
        return valorEsq+valorDir;
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
