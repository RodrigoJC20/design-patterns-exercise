package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.CardSwipper;
import oop.inheritance.model.Card;
import oop.inheritance.model.EntryMode;
import oop.inheritance.model.ExpirationDate;

public class IngenicoCardSwipper implements CardSwipper {
    public IngenicoCardSwipper() {
    }

    @Override
    public Card readCard() {
        return new Card("1246578514563698", new ExpirationDate(23, 10), EntryMode.SWIPED);
    }
}
