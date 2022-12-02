package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.ChipReader;
import oop.inheritance.model.*;

public class VerifoneChipReader implements ChipReader {
    @Override
    public Card readCard() {
        return new Card("5116922313182814", new ExpirationDate(2030, 10), EntryMode.INSERTED);
    }
}
