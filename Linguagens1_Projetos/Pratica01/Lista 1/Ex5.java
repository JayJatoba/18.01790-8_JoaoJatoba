import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        // Exercicio 5
        
        Integer num, fib =0, aux =1, ai =0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o enésimo número de Fibonacci que você quer saber: ");
        num = scanner.nextInt();

        for (int i=0; i<num-1; i++){
            
            fib = ai + aux;
            ai = aux;
            aux =fib; 
            
        }
        if ((num == 1 || num ==2 )){
            System.out.println("O " + num + " da sequencia de Fibonacci é: 1" );
        } 
        else {
            System.out.println("O " + num + " da sequencia de Fibonacci é: " + fib);
        
        }
    }
} 