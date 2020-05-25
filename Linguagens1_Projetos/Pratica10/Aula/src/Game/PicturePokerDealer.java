package Game;

import java.util.ArrayList;
import java.util.List;

import Models.PicturePokerCard;
import Models.PicturePokerDeck;

public class PicturePokerDealer {
    private String name;
    private PicturePokerDeck deck;

    public PicturePokerDealer(String name) {
        this.name = name;
        this.deck = new PicturePokerDeck();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the deck
     */
    public PicturePokerDeck getDeck() {
        return deck;
    }

    public List<PicturePokerCard> dealHand(){
        List<PicturePokerCard> newHand = new ArrayList<>();
        for(int card = 0; card< 5; card++){
            newHand.add(deck.getRandomCard());
        }

        return newHand;
    }

}