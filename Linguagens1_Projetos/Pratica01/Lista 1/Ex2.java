import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {
        // Exercicio 2
        int id1, id2;
        String nome1, nome2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro nome: ");
        nome1 = scanner.nextLine();

        System.out.println("Informe o segundo nome: ");
        nome2 = scanner.nextLine();
        // https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
        System.out.println("Informe a idade da primeira pessoa: ");
        id1 = scanner.nextInt();

        

        System.out.println("Informe a idade da segunda pessoa: ");
        id2 = scanner.nextInt();

        
        
        System.out.println("\nA diferença de idades é: " + Math.abs(id1 - id2));

        if (id1 > id2){
            System.out.println("\n" + nome1 + " é " + (id1 - id2) + " ano(s) mais velho.");
        }
        else if (id1 < id2){
            System.out.println("\n" + nome2 + " é " + (id2 - id1) + " ano(s) mais velho.");
        }
        else{
            System.out.println("\nAs duas pessoas têm a mesma idade.");
        }

    }
} 