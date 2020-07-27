package br.maua;


public class Noh_Raiz {
    protected int tamanho;
    public Nohs noh_raiz;

    public Noh_Raiz(int tamanho,int item) {
        this.tamanho = tamanho;
        noh_raiz = new Nohs(item);
    }

    public int getTamanho() {
        return tamanho;
    }
}