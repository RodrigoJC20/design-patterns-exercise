package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.CardSwipper;
import oop.inheritance.model.*;

public class VerifoneCardSwipper implements CardSwipper {
    @Override
    public Card readCard() {
        return new Card("1246578514563698", new ExpirationDate(23, 10), EntryMode.SWIPED);
    }
}
