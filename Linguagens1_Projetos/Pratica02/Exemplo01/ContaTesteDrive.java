package Exemplo01;
/**
 * ContaTesteDrive
 */
public class ContaTesteDrive {

    public static void main(String[] args) {
        //Declara c1, ainda sem nada dentro
        Conta c1;
        //Instancia Conta - coloca a referencia de um objeto
        c1 = new Conta();
        //Acessa o titular da conta
        c1.titular = "Odair";
        System.out.println("Titular: " + c1.titular); 

        Conta c2 = new Conta();
        c2.titular = "Goku";
        System.out.println("TitularC2: " + c2.titular);  
        System.out.println("Titular: " + c1.titular); 

        c1.saldo=2000;
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        c1.visualizarSaldo();
        c2.visualizarSaldo();
        
        
    }
}