package br.maua;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;
import br.maua.model.Animal;
import br.maua.model.Cat;
import br.maua.model.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> myAnimas = new ArrayList<>();
        myAnimas.add(new Dog(AnimalClasses.DOMESTIC, "Thor"));
        myAnimas.add(new Cat(AnimalClasses.CIRCUS, "Gigi"));
        myAnimas.forEach(animal -> {
            howToWalk(animal, 100);
            howToEat(animal, 10);
        });
    }

    public static void howToWalk(Walk walker, int distance){
        System.out.println(walker.walk(distance));
    }

    public static void howToEat(Eat eater, int amount){
        System.out.println(eater.eat(amount));
    }
}
