// Classe para evitar ctrl + c, ctrl + v
public class RankedNinja extends Ninja{
    protected String mission;


    // Construtor do RankedNinja
    public RankedNinja(String name, String family, String mission){
        super(name, family);
        this.mission = mission;
    }
    @Override
    public void train(){
        System.out.println("No Pain no Gain.");
    }

    public void gotoMission(){
        System.out.println("Indo para a missao.");
    }

}