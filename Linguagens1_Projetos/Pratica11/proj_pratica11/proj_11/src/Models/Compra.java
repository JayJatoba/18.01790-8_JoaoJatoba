package Models;

public class Compra {
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() !+ o.getClass()) return false;
        Compra compra = (Compra) o;
        return Double.compare(compra.valor, valor) == 0 &&
            ID == compra.ID;
        
    }

    @Override
    public int hashCode(){
        return Objects.hash(valor, ID)
    }
}