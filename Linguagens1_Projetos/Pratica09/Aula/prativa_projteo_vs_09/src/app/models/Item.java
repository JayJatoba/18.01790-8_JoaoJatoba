package app.models;

public class Item {
    private int quantidade;
    final private Produto produto;


    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public void incrementarItem(){
        quantidade++;
    }
    public void incrementarItem(int quantidade) {
        this.quantidade +=quantidade;
    }

    public void decrementarItem(int quantidade) {
        this.quantidade -= quantidade;
        if(this.quantidade <=0){
            this.quantidade = 0;
        }
    }


}