package app.implementacoes;

import app.models.Dog;

public class ArrayVersion {
    
    public static void run(){
        // Variaveis primitivas
        // int [] meusInteiros = new int[10];
        // meusInteiros[3] = 42;
        // System.out.println("Valor posicao 3: "+meusInteiros[3]);
        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("Thor", "Golden", 30);
        dogs[0] = dog;
        dogs[1] = new Dog("Fido", "Rosquinha", 12);
        for(int i =0; i<dogs.length;i++){
            System.out.println(dogs[i]);
        }

    }
}