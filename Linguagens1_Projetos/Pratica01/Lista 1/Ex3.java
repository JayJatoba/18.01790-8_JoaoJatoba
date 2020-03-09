import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {
        // Exercicio 3
        
        String user, key;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de usuário: ");
        user = scanner.nextLine();

        while (!user.contentEquals("18.01790-8@maua.br")){
            System.out.println("Usuário não reconhecido. Coloque o usuário certo.");
            user = scanner.nextLine();
        }

        System.out.println("Informe sua senha: ");
        key = scanner.nextLine();
        while (!key.contentEquals("551689031")){
            System.out.println("Senha incorreta. Coloque a senha certa.");
            key = scanner.nextLine();
        }

        System.out.println("Você está logado.);

        

    }
} 