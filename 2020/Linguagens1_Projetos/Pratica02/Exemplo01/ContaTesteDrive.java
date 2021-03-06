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
        c1.cliente = new Cliente();
        //Acessa o titular da conta
        c1.cliente.nome = "Odair";
        System.out.println("Titular: " + c1.cliente.nome); 

        Conta c2 = new Conta();
        // c2.cliente.nome = "Goku";
        // System.out.println("TitularC2: " + c2.cliente.nome);  
        // System.out.println("Titular: " + c1.cliente.nome); 

        c1.saldo=2000;
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        
    }
}