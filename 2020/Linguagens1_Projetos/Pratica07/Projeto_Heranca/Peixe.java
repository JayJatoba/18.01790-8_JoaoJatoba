package Projeto_Heranca;

public class Peixe extends Animal implements Locomover{

    @Override
    public void comer() {
        System.out.println("Bolhas bolhas");

    }

    @Override
    public void comoMeLocomovo() {
        // TODO Auto-generated method stub
        System.out.println("Nadando");
    }

}