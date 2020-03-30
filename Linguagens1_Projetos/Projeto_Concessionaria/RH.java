/**
 * RH
 */
public class RH {

    public static void rodarRh(){
        Gerente g1, g2;
        Vendedor v1, v2;
        double totaldeVendas = 1000;

        g1 = new Gerente(1000);
        v1 = new Vendedor(1000, g1);

        System.out.println("Gerente 1: " + g1.getSalarioFinal(totaldeVendas));
        System.out.println("Vendedor 1: " + v1.getSalarioFinal(totaldeVendas));

        if(g1.darAumento(v1, 0.1)){
            System.out.println("Aumento Deu Certo!");
            System.out.println("Vendedor 1:" + v1.getSalarioFinal(totaldeVendas));}
    

        
    }
}