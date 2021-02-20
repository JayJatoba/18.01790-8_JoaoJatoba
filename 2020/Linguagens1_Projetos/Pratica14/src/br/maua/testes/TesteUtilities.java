package br.maua.testes;

import br.maua.utilities.IdGenerator;

import java.time.Instant;

public class TesteUtilities {
    public static void main(String[] args) {



        System.out.println("Valor random: "+ IdGenerator.generateId());
        System.out.println("Valor random: "+ IdGenerator.generateId());
        System.out.println("Valor random: "+ IdGenerator.generateId());
        System.out.println("");
        System.out.println("Valor formatado: "+IdGenerator.generateIdFormatado());
        System.out.println("Valor formatado: "+IdGenerator.generateIdFormatado());
        System.out.println("Valor formatado: "+IdGenerator.generateIdFormatado());
    }
}
