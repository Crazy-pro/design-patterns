package alex.klimchuk.chainofresponsibility;

import java.util.Objects;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class Logger {
    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeMessage(message);
        }
        if (Objects.nonNull(nextLogger)) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void writeMessage(String message);
}
