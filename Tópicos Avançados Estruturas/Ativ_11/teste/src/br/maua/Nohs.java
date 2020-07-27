package br.maua;

public class Nohs {
    protected int item;
    protected String diretorio;
    protected int memoria;
    public Nohs noh_pai;
    public Nohs noh_prime_filho;
    public Nohs noh_proximo;
    public int somaMemoria;

    public Nohs(int item, String diretorio, int memoria) {
        this.item = item;
        this.diretorio = diretorio;
        this.memoria = memoria;
        noh_pai = null;
        noh_prime_filho= null;
        noh_proximo=null;
    }


    public static void imprimeFilhos(Nohs ponteiro){
        System.out.println("\n\n****Funcao imprimeFilhos******\n");
        if(ponteiro.noh_prime_filho==null){
            System.out.println("\nEste noh nao tem filhos..");
            return;
        }
        Nohs aux=ponteiro.noh_prime_filho;
        while(aux!=null){
            System.out.println(aux.getDiretorio());
            aux=aux.noh_proximo;
        }
    }

    public static void imprimePai(Nohs ponteiro){
        System.out.println("\n\n****Funcao imprimePai******\n");
        if(ponteiro.noh_pai==null){
            System.out.println("\nEste noh nao tem pai..");
            return;
        }
        Nohs aux=ponteiro;
        System.out.println(aux.noh_pai.getDiretorio());
    }

    public static void posOrder(Nohs ponteiro){
        Nohs aux = ponteiro.noh_prime_filho;
        
        while(aux!=null){
            posOrder(aux);
            aux=aux.noh_proximo;
        }
        System.out.println(ponteiro.item);
    }

    

    public int getItem() {
        return item;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public int getMemoria() {
        return memoria;
    }
 
}