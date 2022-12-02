package oop.inheritance.terminal;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.interfaces.Terminal;
import oop.inheritance.terminal.ingenico.Ingenico;
import oop.inheritance.terminal.verifone.Verifone;

public class TerminalFactory {
    private static Terminal terminal;

    public static Terminal getInstance(SupportedTerminal supportedTerminal) {
        if (terminal != null) return terminal;

        switch (supportedTerminal) {
            case INGENICO -> terminal = new Ingenico();
            case VERIFONE520, VERIFONE240, VERIFONE690 -> terminal = new Verifone();
        }

        return terminal;
    }
}
