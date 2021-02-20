import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        // Exercicio 1
        int id;
        String ra, nc, tel, em;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu R.A. (00.00000-0): ");
        ra = scanner.nextLine();

        System.out.println("Informe seu nome completo: ");
        nc = scanner.nextLine();

        System.out.println("Informe seu telefone: ");
        tel = scanner.nextLine();

        System.out.println("Informe seu e-mail: ");
        em = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        id = scanner.nextInt();

        System.out.println("R.A.:" + ra);
        System.out.println("Nome Completo: " + nc);
        System.out.println("Telefone: " + tel);
        System.out.println("E-mail: " + em);
        System.out.println("Idade: " + id);


    }
} 