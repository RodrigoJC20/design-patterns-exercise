package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.Ethernet;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class IngenicoEthernet implements Ethernet {
    public IngenicoEthernet() {
    }

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
