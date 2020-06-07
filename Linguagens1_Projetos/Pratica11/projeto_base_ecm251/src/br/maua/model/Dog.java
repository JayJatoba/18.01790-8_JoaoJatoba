package br.maua.model;

import br.maua.enumerates.AnimalClasses;


/**
 * Classe de dog
 * @author João Guilherme Martins Jatobá - jguilhermejatoba@hotmail.com
 * @since 01/06/2020
 * @version 1.0
 */
public class Dog extends Animal {
    public Dog(AnimalClasses animalClass, String name) {
        super(animalClass, name);
    }


    /**
     * Método implementado da interface Eat, que descreve como o animal anda e come
     * @param amount Quantos kilos de comida nosso cachorro comeu
     * 
     * @return Uma string com as informações do nome e cachorro e a quantidade consumida
     * de alimento e comida
     */
    @Override
    public String eat(int amount) {
        return String.format("Dog: %s eated %d kilograms!", this.getName(), amount);
    }

    @Override
    public String walk(int distance) {
        return String.format("Dog: %s walked %d kilometers!", this.getName(), distance);
    }
}
