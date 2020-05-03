package Projeto_Heranca;

import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Peixe peixe = new Peixe();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cachorro);
        animals.add(lobo);
        animals.add(peixe);

        // // Metodo 1
        // System.out.println("For tradicional: ");
        // for (int i=0; i<animals.size();i++){
        //     animals.get(i).comer();
        // }

        // Metodo 2
        System.out.println("Enhanced for (Foreach): ");
        for(Animal animal : animals){
            animal.comer();
            if(animal instanceof Canino){
                System.out.println("Canino!");
                ComportamentoCanino((Canino)animal);
            }


            // // Possivel jeito de apresentar jeitos de locomover
            // if(animal instanceof Locomover){
            //     ((Locomover) animal).comoMeLocomovo();
            // }
        }
        // Possivel jeito de apresentar jeitos de locomover
        andaAe(cachorro);
        andaAe(lobo);
        andaAe(peixe);

        // cachorro.comer();
        // lobo.comer();
        // peixe.comer();
    }

    public static void ComportamentoCanino(Canino canino){
        canino.cheirar();

    }

    public static void andaAe(Locomover locomover) {
        locomover.comoMeLocomovo();
    }
}