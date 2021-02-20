/**
 * RH
 */
public class RH {

    public static void rodarRh(){
        Gerente g1,g2;
        Vendedor v1,v2;
        double totaldeVendas = 1000;

        g1 = new Gerente(1000);
        v1 = new Vendedor(1000, g1);

        exibirSalarioFinal(totaldeVendas, g1);
        exibirSalarioFinal(totaldeVendas, v1);

        if(g1.darAumento(v1, 0.1)){
            System.out.println("Aumento Deu Certo!");}
        
        exibirSalarioFinal(totaldeVendas, v1);

    }

    public static void exibirSalarioFinal(double totaldeVendas, Funcionario funcionario){
        System.out.println("Salario Final: "+funcionario.getSalarioFinal(totaldeVendas));
    }
}