package Models;

/**
 * PicturePokerCard
 */
public class PicturePokerCard {

    private PicturePokerCardValues value;
    private int id;

    public PicturePokerCard(PicturePokerCardValues value, int id) {
        this.value = value;
        this.id = id;
    }

/**
     * @return the value
     */
    public PicturePokerCardValues getValue() {
        return value;
    }




    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PicturePokerCard [value=" + value + ", id=" + id + "]";
    }

    
    

    
    



    
}