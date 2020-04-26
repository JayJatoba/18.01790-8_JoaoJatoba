/**
 * Vendedor
 */
public class Vendedor extends Funcionario{
// nao cheira bem----------
    private Gerente gerente;


// Construtor
    public Vendedor(double salarioBase, Gerente gerente) {
        super(salarioBase);
        this.gerente = gerente;
	}

    
    public boolean setSalarioBase(double novoSalario, Gerente gerente){
        if (this.gerente.equals(gerente)){
            this.salarioBase = novoSalario;
            return true;
        }
        else
            return false;
    }

    /**
     * @return the gerente
     */
    public final Gerente getGerente() {
        return gerente;
    }
}