package br.maua.model;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;

public abstract class Animal implements Walk, Eat {
    private AnimalClasses animalClass;
    private String name;

    /**
     * 
     * @param animalClass Enumeração que define o tipo de animal
     * @param name        Nome escolhido para o animal
     */

    public Animal(AnimalClasses animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }


    /**
     * 
     * @return Getter para a enumeração do tipo animal
     */
    public AnimalClasses getAnimalClass() {
        return animalClass;
    }

    public String getName() {
        return name;
    }
}
