package alex.klimchuk.templatemethod;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class FootballGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game: Initializing");
    }

    @Override
    protected void start() {
        System.out.println("Football Game: Starting");
    }

    @Override
    protected void end() {
        System.out.println("Football Game: Ending");
    }
}
