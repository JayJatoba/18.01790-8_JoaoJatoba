package app;

import app.compras.SistemaCompras;
import app.implementacoes.ArrayListVersion;
import app.implementacoes.ArrayVersion;
import app.implementacoes.LinkedListVersion;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        SistemaCompras sistemaCompras = new SistemaCompras();
        sistemaCompras.run();
}}