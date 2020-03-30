

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Total de contas: "+ MinhaClasse.getContaObjetos());
        // MinhaClasse m1 = new MinhaClasse();
        // MinhaClasse m2 = new MinhaClasse();
        // System.out.println("Total de contas: "+ MinhaClasse.getContaObjetos());

        Personagem p1 = new Personagem("allmight");
        Personagem p2 = new Personagem("midoria");
        System.out.println("URL P1: "+ p1.getUrl());
        System.out.println("URL P2: "+ p2.getUrl());

    }
    
}