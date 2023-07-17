package alex.klimchuk.templatemethod;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class Game {
    public final void play() {
        initialize();
        start();
        end();
    }

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();
}
