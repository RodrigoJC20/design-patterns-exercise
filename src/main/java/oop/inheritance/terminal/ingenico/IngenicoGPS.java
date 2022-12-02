package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.GPS;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class IngenicoGPS implements GPS {
    public IngenicoGPS() {
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
        return new TransactionResponse(true, "782132");
    }

    @Override
    public void close() {
    }
}
