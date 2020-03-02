package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        double n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois valroes: ");
        n1 = scanner.nextDouble();
        //Ctrl + d duplica a linha
        n2 = scanner.nextDouble();

        if(n1 > n2){
            System.out.println("N1 maior");
        }
        else if (n1<n2){
            System.out.println("N2 maior");
        }
        else{
            System.out.println("Sao iguais");
        }



    }
}
