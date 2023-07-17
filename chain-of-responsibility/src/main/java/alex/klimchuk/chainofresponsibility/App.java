package alex.klimchuk.chainofresponsibility;

import org.slf4j.event.Level;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger(Level.INFO.toInt());
        Logger fileLogger = new FileLogger(Level.DEBUG.toInt());
        Logger emailLogger = new EmailLogger(Level.ERROR.toInt());

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        consoleLogger.logMessage(Level.INFO.toInt(), "This is an information message");
        consoleLogger.logMessage(Level.DEBUG.toInt(), "This is a debug message");
        consoleLogger.logMessage(Level.ERROR.toInt(), "This is an error message");
    }
}