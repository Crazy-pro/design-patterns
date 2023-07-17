package alex.klimchuk.interpreter;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
