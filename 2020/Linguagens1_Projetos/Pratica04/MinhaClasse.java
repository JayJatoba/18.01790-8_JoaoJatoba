
/**
 * MinhaClasse
 */
public class MinhaClasse {
    private static int contaObjetos = 0;
    
    
    public MinhaClasse(){
        MinhaClasse.contaObjetos = MinhaClasse.contaObjetos +1;

    }
    
    public static int getContaObjetos(){
        return MinhaClasse.contaObjetos;
    }

}