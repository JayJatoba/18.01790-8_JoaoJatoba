package br.maua;

public class Noh_Raiz{
    protected int tamanho;
    public Nohs noh_raiz;

    public Noh_Raiz(int tamanho,int item, String diretorio, int memoria) {
        this.tamanho = tamanho;
        noh_raiz = new Nohs(item, diretorio, memoria);
    }

}