

import br.maua.Noh_Raiz;
import br.maua.Nohs;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Noh_Raiz raiz =  new Noh_Raiz(6, 7);

        Nohs no8 = new Nohs(8);
        Nohs no9 = new Nohs(9);
        Nohs no5 = new Nohs(5);
        Nohs no10 = new Nohs(10);
        Nohs no3 = new Nohs(3);

        raiz.noh_raiz.noh_esquerda=no5;
        raiz.noh_raiz.noh_direita=no9;

        no5.noh_pai=raiz.noh_raiz;
        no9.noh_pai=raiz.noh_raiz;

        no9.noh_esquerda=no8;
        no9.noh_direita=no10;
        no8.noh_pai=no9;
        no10.noh_pai=no9;

        no5.noh_esquerda=no3;
        no3.noh_pai=no5;

        System.out.println("Questao 2-)");
        Nohs.insereValor(raiz.noh_raiz, 0);
        Nohs.procuraValor(raiz.noh_raiz, 0, 0);
        Nohs.insereValor(raiz.noh_raiz, 4);
        Nohs.insereValor(raiz.noh_raiz, 11);
        Nohs.insereValor(raiz.noh_raiz, 12);
        Nohs.insereValor(raiz.noh_raiz, 4);
        System.out.println("\nQuestao3-)\nPor PreOrder: ");
        Nohs.preOrder(raiz.noh_raiz);
        System.out.println("\nQuestao 4-)\nPor PostOrder: ");
        Nohs.posOrder(raiz.noh_raiz);
        System.out.println("\nQuestao 5-)\nPor InOrder: ");
        Nohs.inOrder(raiz.noh_raiz);
        System.out.println("\nQuestao 6-)\nProcura valor: (8 e 10)");
        Nohs.procuraValor(raiz.noh_raiz, 8, 0);
        Nohs.procuraValor(raiz.noh_raiz, 10, 0);
        System.out.println("\nQuestao 7-)\nValor min = "+menorValor(raiz.noh_raiz));
        System.out.println("\nQuestao 8-)\nQuantidade nos = "+Nohs.quantidadeNohs(raiz.noh_raiz));
        System.out.println("\nQuestao 9-)\nMédia aritmetica total = "+mediaValor(raiz));
        System.out.println("wefwfe");
        System.out.println("\nQuestao 10-)\nAltura: "+alturaArvore(raiz.noh_raiz));
        System.out.println("\nQuestao 11-)\nQuantidade de nulls = "+Nohs.quantidadeNulls(raiz.noh_raiz));
        System.out.println("\nQuestao 12-)\nMultiplos de dois: ");
        Nohs.multDois(raiz.noh_raiz);
        System.out.println("\nQuestao 13-)\nSoma total = "+somaValor(raiz.noh_raiz));
    }
    

    public static int menorValor(Nohs ponteiro){
        if (ponteiro == null)
            return Integer.MAX_VALUE;
        int valor = ponteiro.getItem();
        int valorEsq=menorValor(ponteiro.noh_esquerda);
        int valorDir=menorValor(ponteiro.noh_direita);

        if (valorEsq<valor)
            valor = valorEsq;
        if(valorDir<valor)
            valor = valorDir;
        
        return valor;
    }

    public static double mediaValor(Noh_Raiz raiz){
        return somaValor(raiz.noh_raiz)/Nohs.quantidadeNohs(raiz.noh_raiz);
    }

    public static int somaValor(Nohs ponteiro){
        if (ponteiro == null)
            return 0;
        
        return (ponteiro.getItem()+somaValor(ponteiro.noh_esquerda)+somaValor(ponteiro.noh_direita));
    }



    public static int alturaArvore(Nohs ponteiro){
        if (ponteiro.noh_esquerda == null && ponteiro.noh_direita==null){
            return 0;
        }
        else 
        { 
            int altEsq=0;
            int altDir=0;
            /* compute the depth of each subtree */
            if (Nohs.ehEsquerdo(ponteiro))
                altEsq =alturaArvore(ponteiro.noh_esquerda); 
            if (Nohs.ehDireito(ponteiro))
                altDir =alturaArvore(ponteiro.noh_direita); 
   
            /* use the larger one */
            if (altEsq> altDir) 
                return (altEsq+ 1); 
             else 
                return (altDir + 1); 
        } 
    
}}
