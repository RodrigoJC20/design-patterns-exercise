package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.*;

public class Ingenico implements Terminal {
    private final Display display;
    private final Keyboard keyboard;
    private final Ethernet ethernet;
    private final Modem modem;
    private final Printer printer;
    private final GPS gps;
    private final ChipReader chipReader;
    private final CardSwipper cardSwipper;
    private final StorageSystem storageSystem;

    public Ingenico() {
        display = new IngenicoDisplay();
        keyboard = new IngenicoKeyboard();
        ethernet = new IngenicoEthernet();
        modem = new IngenicoModem();
        printer = new IngenicoPrinter();
        gps = new IngenicoGPS();
        chipReader = new IngenicoChipReader();
        cardSwipper = new IngenicoCardSwipper();
        storageSystem = new IngenicoStorageSystem();
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
