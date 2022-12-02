package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.Modem;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class IngenicoModem implements Modem {
    public IngenicoModem() {
    }

    @Override
    public boolean open() {
        return true;
    }

    @Override
    public boolean send(Transaction message) {
        return true;
    }

    @Override
    public TransactionResponse receive() {
        return new TransactionResponse(true, "132123");
    }

    @Override
    public void close() {
    }
}
