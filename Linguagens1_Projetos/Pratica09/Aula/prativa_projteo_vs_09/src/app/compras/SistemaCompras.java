package app.compras;

import java.util.ArrayList;
import java.util.List;

import app.models.Produto;

public class SistemaCompras {
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;
    
    
    public void run() {
        exibirListaProdutos();
    }

    public SistemaCompras() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Final Fantasy 7", 299));
        produtos.add(new Produto(2, "Zelda - BOTW", 299));
        produtos.add(new Produto(3, "Mario - Odissey", 399));
        produtos.add(new Produto(4, "Animal Crossing", 399));
    
        listaCompras = new ListaCompras();
    }

    public void exibirListaProdutos(){
        System.out.println("Lista de produtos disponiveis: ");
        produtos.forEach((produto) -> System.out.println(produto));
    }
}