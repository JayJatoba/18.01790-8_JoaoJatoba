import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        // Exercicio 6
        
        Integer ini, fim, soma=0, prod = 1;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial da sequência: ");
        ini = scanner.nextInt();
        fim = ini;
        while (fim<= ini){
            System.out.println("Informe o valor final (maior que o inicial) da sequência: ");
            fim = scanner.nextInt();
        }
        
        for (int i = ini; i <=fim; i++){
            soma = ini + soma;
            prod = prod*ini;
            ini++;
        }

        System.out.println("A soma de todos os números da sequência é: " + soma);
        System.out.println("O produto dos números é: " + prod);
    }
} 