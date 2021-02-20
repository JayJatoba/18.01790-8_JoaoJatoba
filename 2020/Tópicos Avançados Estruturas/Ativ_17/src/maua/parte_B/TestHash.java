package maua.parte_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHash {
    public static void main(String[] args) {
        System.out.println("Quer com 20 chaves (1) ou 100.000 (2)?");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        boolean flag = true;
        while (flag) {
            switch (opcao) {
                case 1:
                    metodo(10);
                    flag = false;
                    break;
                case 2:
                    metodo(1000);
                    flag = false;
                    break;
                default:
                    System.out.println("Escolher 1 ou 2.");
                    opcao = sc.nextInt();
                    break;
            }
        }
    }

    public static void metodo(int tamanho){
        int chaves;
        if(tamanho==10){chaves = 20;}
        else{chaves=100000;}

        Integer[] tabKeys=new Integer[chaves];
        for (int i = 1; i < chaves; i++) {
            tabKeys[i]=i;
        }

        List<SList> tabHash = new ArrayList<>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            tabHash.add(new SList());
        }

        for (int i = 1; i < chaves; i++) {

            Integer valor = hash(tabKeys[i],tamanho);
            tabHash.get(valor).insereInicio(tabKeys[i]);
        }

        for (int i = 0; i < tamanho; i++) {
            SList.printLista(tabHash.get(i));
        }


    }

    public static Integer hash(Integer key,int tamanho) {
        return (key % tamanho);
    }
}
