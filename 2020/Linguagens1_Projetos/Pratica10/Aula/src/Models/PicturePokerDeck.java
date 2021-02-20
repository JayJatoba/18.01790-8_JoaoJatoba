package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PicturePokerDeck {
    private List<PicturePokerCard> deckList;

    public PicturePokerDeck(){
        this.deckList = createDeckList();
    }

    private List<PicturePokerCard> createDeckList() {
        List<PicturePokerCard> newDeck = new ArrayList<>();
        for (PicturePokerCardValues value : PicturePokerCardValues.values() ){
            for (int myId = 1; myId<=5; myId++) {
                newDeck.add(new PicturePokerCard(value,myId));
            }
        }

        return newDeck;
    }

    /**
     * @return the deckList
     */
    public List<PicturePokerCard> getDeckList() {
        return deckList;
    }

	public PicturePokerCard getRandomCard() {
        // pick a random card from the deck, and remove it from the total deck
        // used for dealing hands
		return deckList.remove(new Random().nextInt(deckList.size() ));
	}

}