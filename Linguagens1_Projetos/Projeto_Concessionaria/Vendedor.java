/**
 * Vendedor
 */
public class Vendedor {
// nao cheira bem----------
    private double salarioBase;
    private double comissao;
    private Gerente gerente;


// Construtor
    public Vendedor(double salarioBase, Gerente gerente) {
        this.salarioBase = salarioBase;
        this.gerente = gerente;
        this.comissao = 0.05;
	}

    public double getSalarioBase() {
        return salarioBase;
}
    public boolean setSalarioBase(double novoSalario, Gerente gerente){
        if (this.gerente.equals(gerente)){
            this.salarioBase = novoSalario;
            return true;
        }
        else
            return false;
    }

    public double getComissao(){
        return comissao;
}
    

    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao*totalVendasMes;
}
    /**
     * @return the gerente
     */
    public final Gerente getGerente() {
        return gerente;
    }
}