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