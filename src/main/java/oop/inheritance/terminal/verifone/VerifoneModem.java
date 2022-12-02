package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.Modem;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class VerifoneModem implements Modem {
    public boolean open() {
        return true;
    }

    public boolean send(Transaction transaction) {
        return true;
    }

    public TransactionResponse receive() {
        return new TransactionResponse(true, "12314");
    }

    public void close() {
    }
}
