package br.maua.model;

import br.maua.enumerates.AnimalClasses;

public class Dog extends Animal {
    public Dog(AnimalClasses animalClass, String name) {
        super(animalClass, name);
    }

    @Override
    public String eat(int amount) {
        return String.format("Dog: %s eated %d kilograms!", this.getName(), amount);
    }

    @Override
    public String walk(int distance) {
        return String.format("Dog: %s walked %d kilometers!", this.getName(), distance);
    }
}
