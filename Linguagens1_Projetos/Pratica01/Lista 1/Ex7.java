import java.util.Scanner;
import java.util.Arrays;



public class Ex7 {
    public static void main(String[] args) {
        // Exercicio 7
        
        Integer num=-1, sum=0, n;
        
        
        Scanner scanner = new Scanner(System.in);


        
        while (num<=9){
            System.out.println("Informe o valor para somar os algarismos (>=10): ");
            num = scanner.nextInt();
        }
        while (num > 0){
            n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        System.out.println("A soma dos algarismos é: " + sum);
    }
} 