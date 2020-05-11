package app.compras;

import java.util.ArrayList;
import java.util.List;

import app.models.Item;
import app.models.Produto;

public class ListaCompras {
    
    private final List<Item> listaDeCompras;

    public ListaCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        this.listaDeCompras.add(
            new Item(1, produto)
        );
    }

    /**
     * @return the listaDeCompras
     */
    //Apenas para teste
    public List<Item> getListaDeCompras() {
        return this.listaDeCompras;
    }

}