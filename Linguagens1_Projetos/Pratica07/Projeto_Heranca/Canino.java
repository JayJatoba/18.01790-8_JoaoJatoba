package Projeto_Heranca;

public abstract class Canino extends Animal implements Locomover{
    public abstract void cheirar();

    @Override
    public void comoMeLocomovo() {
        // TODO Auto-generated method stub
        System.out.println("Andando");
    }
}