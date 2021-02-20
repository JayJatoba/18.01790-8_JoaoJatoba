import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        // Exercicio 4
        
        String str, aux = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a frase para verificar se esta é ou nao um palíndromo: ");
        str = scanner.nextLine();
        
        for (int i = str.length()-1; i>=0; i--){
            aux = aux + str.charAt(i);
        }

        if (str.equals(aux))
            System.out.println(str + " é um palíndromo.");
        else
            System.out.println(str + " nao é um palíndromo.");
        
        
        
        
        

        

    }
} 