package Interfaces;

import java.util.List;

import Models.PicturePokerCard;
import Models.PicturePokerHandValues;

public interface PicturePokerCheckHand {
    PicturePokerHandValues checkHand(List<PicturePokerCard> carList);
}