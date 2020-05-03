
public class SpecialJounin extends RankedNinja{

    public SpecialJounin(String name, String family, String mission) {
        super(name, family, mission);
    }

    @Override
    public void train(){
        System.out.println("Treinando para: "+mission);
    }
}