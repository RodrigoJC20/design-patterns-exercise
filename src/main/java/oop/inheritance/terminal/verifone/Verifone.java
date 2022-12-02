package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.*;

public class Verifone implements Terminal {
    private final Display display;
    private final Keyboard keyboard;
    private final Ethernet ethernet;
    private final Modem modem;
    private final Printer printer;
    private final GPS gps;
    private final ChipReader chipReader;
    private final CardSwipper cardSwipper;
    private final StorageSystem storageSystem;

    public Verifone() {
        display = new VerifoneDisplay();
        keyboard = new VerifoneKeyboard();
        ethernet = null;
        modem = null;
        printer = new VerifonePrinter();
        gps = null;
        chipReader = new VerifoneChipReader();
        cardSwipper = new VerifoneCardSwipper();
        storageSystem = new VerifoneStorageSystem();
    }

    @Override
    public Display getDisplay() {
        return display;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public Ethernet getEthernet() {
        return ethernet;
    }

    public Modem getModem() {
        return modem;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }

    @Override
    public GPS getGPS() {
        return gps;
    }

    @Override
    public ChipReader getChipReader() {
        return chipReader;
    }

    @Override
    public CardSwipper getCardSwipper() {
        return cardSwipper;
    }

    @Override
    public StorageSystem getStorageSystem() {
        return storageSystem;
    }
}
