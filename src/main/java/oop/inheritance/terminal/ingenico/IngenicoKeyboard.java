package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.Keyboard;

public class IngenicoKeyboard implements Keyboard {
    public IngenicoKeyboard() {
    }

    @Override
    public String getChar() {
        return "K";
    }

    @Override
    public String readLine() {
        return "12.31";
    }
}
