package alex.klimchuk.chainofresponsibility;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Console Logger: " + message);
    }
}
