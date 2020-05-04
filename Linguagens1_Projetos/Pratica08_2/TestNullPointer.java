public class TestNullPointer {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = frase.toUpperCase();
        System.out.println("Frase original: "+frase);
        System.out.println("Frase modificada: "+ novaFrase);
    }
}