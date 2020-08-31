package br.maua.models;

import br.maua.utilities.IdGenerator;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private String id;

    public Venda(Vendedor vendedor, Cliente cliente, Produto produto) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.id = IdGenerator.generateIdFormatado();

    }
}
