package br.maua;

public class Nohs {
    protected int item;
    public Nohs noh_pai;
    public Nohs noh_direita;
    public Nohs noh_esquerda;

    public Nohs(int item) {
        this.item = item;
        
        noh_pai = null;
        noh_direita= null;
        noh_esquerda=null;
    }
    public static void preOrder(Nohs ponteiro){
        System.out.println(ponteiro.getItem());
        if(ehEsquerdo(ponteiro)){
            preOrder(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            preOrder(ponteiro.noh_direita);
        }
    }
    public static void posOrder(Nohs ponteiro){
        if(ehEsquerdo(ponteiro)){
            posOrder(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            posOrder(ponteiro.noh_direita);
        }
        System.out.println(ponteiro.getItem());
    }
    public static void inOrder(Nohs ponteiro){
        if(ehEsquerdo(ponteiro)){
            posOrder(ponteiro.noh_esquerda);
        }
        System.out.println(ponteiro.getItem());
        if (ehDireito(ponteiro)) {
            posOrder(ponteiro.noh_direita);
        }
    }

    public static void multDois(Nohs ponteiro){
        if(ponteiro.getItem()%2==0){
            System.out.println(ponteiro.getItem());}
        if(ehEsquerdo(ponteiro)){
            multDois(ponteiro.noh_esquerda);
        }
        if (ehDireito(ponteiro)) {
            multDois(ponteiro.noh_direita);
        }
        
    }

    public static void procuraValor(Nohs ponteiro,int valor){
        
        if(ehEsquerdo(ponteiro)){
            
            procuraValor(ponteiro.noh_esquerda,valor);
        }
        
        if (ehDireito(ponteiro)) {
            
            procuraValor(ponteiro.noh_direita, valor);
        }
        int valorEsq = ponteiro.noh_esquerda.getItem();
        int valorDir = ponteiro.noh_direita.getItem();
        if (ponteiro.getItem()==valor){
            System.out.println("Valor "+valor+" encontrado.");
            return;}
        else if(ponteiro.noh_pai==null && valorEsq!= valor && valorDir!=valor){
            System.out.println("Valor "+valor+" nao encontrado.");
            return;
        }
        
    }
    
    public static boolean ehEsquerdo(Nohs ponteiro){
        if(ponteiro.noh_esquerda==null)
            return false;
        return true;
    }

    public static boolean ehDireito(Nohs ponteiro){
        if(ponteiro.noh_direita==null)
            return false;
        return true;}

    public int getItem() {
        return item;
    }
}