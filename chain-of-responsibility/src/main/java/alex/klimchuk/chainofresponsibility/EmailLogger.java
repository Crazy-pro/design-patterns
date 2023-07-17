package alex.klimchuk.chainofresponsibility;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class EmailLogger extends Logger {
    public EmailLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Email Logger: " + message);
    }
}
