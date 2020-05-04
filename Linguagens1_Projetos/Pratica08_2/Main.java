public class Main {
    public static void main(String[] args) {
        System.out.println("inicio da main!");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1(){
        System.out.println("inicio metodo 1");
        try {metodo2();}
        catch(Exception exception){
            System.out.println("Algo inesperado aconteceu!");
        }
        System.out.println("fim metodo 1");
    }

    static void metodo2() throws Exception {
        System.out.println("inicio metodo 2");
        int[] array = new int[10];
        // for(int i = 0 ; i<=15; i++){
        //     try {
        //         array[i] = i;
        //     }
            
        //     catch(NullPointerException e){
        //         System.out.println("Tentou acessar posicao invalida: "+ i);
        //     }
        //     catch(ArrayIndexOutOfBoundsException e){
        //         System.out.println("Oi");}
        //     catch(RuntimeException e){
        //         System.out.println("runtime");
        //     }
            
        //         System.out.println(i);
        // 
        try{
        for(int i = 0 ; i<=15; i++){
            array[i] = i;      
            
            System.out.println(i);}}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Tentou acessar posicao invalida: " + e.getLocalizedMessage());
            throw new Exception("Deu ruim Aqui!");
    }
        System.out.println("fim metodo 2");
    }
}