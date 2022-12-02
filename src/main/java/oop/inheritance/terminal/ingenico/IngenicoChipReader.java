package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.ChipReader;
import oop.inheritance.model.Card;
import oop.inheritance.model.EntryMode;
import oop.inheritance.model.ExpirationDate;

public class IngenicoChipReader implements ChipReader {
    public IngenicoChipReader() {
    }

    @Override
    public Card readCard() {
        return Card.builder().account("4558211532252558").entryMode(EntryMode.INSERTED).expirationDate(ExpirationDate.builder().year(20).month(8).build()).build();
    }
}
