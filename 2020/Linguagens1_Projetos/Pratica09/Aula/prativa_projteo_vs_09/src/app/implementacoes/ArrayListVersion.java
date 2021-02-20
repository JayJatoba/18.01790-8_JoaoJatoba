package app.implementacoes;



import java.util.ArrayList;

import app.models.Dog;

public class ArrayListVersion {
    public static void run(){
        ArrayList<Dog> dogs= new ArrayList<>();
        Dog dog = new Dog("D1", "Cachorro", 1);
        dogs.add(dog);
        dogs.add(new Dog("D2", "Musica", 55));
        dog = new Dog("D3", "Dado", 4);
        if(!dogs.contains(dog))
            dogs.add(dog);
        // // Nao fazer assim!!
        // for (int i =0; i<dogs.size();i++){
        //     System.out.println(dogs.get(i));
        // }

        for (Dog dogNovo : dogs) {
            System.out.println(dogNovo);
        }

        dogs.forEach((cachorroDaLabmda) ->System.out.println(cachorroDaLabmda));

    }
}