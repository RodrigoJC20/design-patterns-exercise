package oop.inheritance;

import java.time.LocalDateTime;

import oop.inheritance.data.*;
import oop.inheritance.interfaces.*;
import oop.inheritance.terminal.TerminalFactory;
import oop.inheritance.model.Card;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class Application {

    private final CommunicationType communicationType = CommunicationType.ETHERNET;
    private final Terminal terminal;

    public Application(SupportedTerminal supportedTerminal) {
        terminal = TerminalFactory.getInstance(supportedTerminal);
    }

    public void showMenu() {
        terminal.getDisplay().showMessage(5, 5, "Menu");
        terminal.getDisplay().showMessage(5, 10, "1. VENTA");
        terminal.getDisplay().showMessage(5, 13, "2. DEVOLUCION");
        terminal.getDisplay().showMessage(5, 16, "3. REPORTE");
        terminal.getDisplay().showMessage(5, 23, "4. CONFIGURACION");
    }

    public String readKey() {
        return terminal.getKeyboard().getChar();
    }

    public void doSale() {
        CardSwipper cardSwipper = terminal.getCardSwipper();
        ChipReader chipReader = terminal.getChipReader();
        Display display = terminal.getDisplay();
        Keyboard keyboard = terminal.getKeyboard();
        Card card;

        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        display.clearScreen();
        display.showMessage(5, 20, "Capture monto:");

        String amount =keyboard.readLine(); //Amount with decimal point as string

        Transaction transaction = new Transaction();

        transaction.setLocalDateTime(LocalDateTime.now());
        transaction.setCard(card);
        transaction.setAmountInCents(Integer.parseInt(amount.replace(".", "")));

        TransactionResponse response = sendSale(transaction);

        if (response.isApproved()) {
            display.showMessage(5, 25, "APROBADA");
            printReceipt(transaction, response.getHostReference());
        } else {
            display.showMessage(5, 25, "DENEGADA");
        }
    }

    private void printReceipt(Transaction transaction, String hostReference) {
        terminal.getPrinter().print(5, "APROBADA");
        terminal.getPrinter().lineFeed();
        terminal.getPrinter().print(5, transaction.getCard().getAccount());
        terminal.getPrinter().lineFeed();
        terminal.getPrinter().print(5, "" + transaction.getAmountInCents());
        terminal.getPrinter().lineFeed();
        terminal.getPrinter().print(5, "________________");
    }

    private TransactionResponse sendSale(Transaction transaction) {
        Ethernet ethernet = terminal.getEthernet();
        Modem modem = terminal.getModem();
        GPS gps = terminal.getGPS();
        TransactionResponse transactionResponse = null;

        switch (communicationType) {
            case ETHERNET -> {
                ethernet.open();
                ethernet.send(transaction);
                transactionResponse = ethernet.receive();
                ethernet.close();
            }
            case GPS -> {
                gps.open();
                gps.send(transaction);
                transactionResponse = gps.receive();
                gps.close();
            }
            case MODEM -> {
                modem.open();
                modem.send(transaction);
                transactionResponse = modem.receive();
                modem.close();
            }
        }

        return transactionResponse;
    }

    public void doRefund() {
    }

    public void printReport() {
    }

    public void showConfiguration() {
    }

    public void clearScreen() {
        terminal.getDisplay().clearScreen();
    }
}
