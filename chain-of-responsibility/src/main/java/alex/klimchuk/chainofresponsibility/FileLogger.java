package alex.klimchuk.chainofresponsibility;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class FileLogger extends Logger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("File Logger: " + message);
    }
}
