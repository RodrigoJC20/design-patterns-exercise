package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.Ethernet;
import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public class VerifoneEthernet implements Ethernet {
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
