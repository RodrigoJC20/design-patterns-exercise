package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.Keyboard;

public class VerifoneKeyboard implements Keyboard {
    @Override
    public String getChar() {
        return "Key pressed";
    }

    @Override
    public String readLine() {
        return null;
    }
}
