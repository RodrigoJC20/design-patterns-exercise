package oop.inheritance.interfaces;

public interface Terminal {
    Display getDisplay();
    Keyboard getKeyboard();
    Printer getPrinter();
    CardSwipper getCardSwipper();
    ChipReader getChipReader();
    GPS getGPS();
    Modem getModem();
    Ethernet getEthernet();
    StorageSystem getStorageSystem();
}
