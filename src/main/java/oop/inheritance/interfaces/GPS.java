package oop.inheritance.interfaces;

import oop.inheritance.model.Transaction;
import oop.inheritance.model.TransactionResponse;

public interface GPS {
    boolean open();
    TransactionResponse receive();
    boolean send(Transaction message);
    void close();
}
