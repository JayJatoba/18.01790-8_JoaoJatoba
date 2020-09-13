package maua.parte_B;

import java.util.*;

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

        List<Integer> tabKeys = Arrays.asList(new Integer[chaves]);
        for (int i=1;i< tabKeys.size();i++){
            tabKeys.set(i, i);
        }
        System.out.println();

        List<List<Integer>> tabHash = new ArrayList<>(tamanho);
        for (int j=0;j< tamanho;j++){
            tabHash.add(new LinkedList<>());
        }

        System.out.println();
        for (int m=1;m< tabKeys.size();m++){
            SList.insereInicio(tabHash.get(hash(m,tamanho)),tabKeys.get(m));
        }
        for (List<Integer> hash : tabHash) {

            System.out.println(hash);
        }
    }


    public static Integer hash(Integer key,int tamanho) {
        return (key % tamanho);
    }
}
