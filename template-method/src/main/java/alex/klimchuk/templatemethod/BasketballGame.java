package alex.klimchuk.templatemethod;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class BasketballGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Basketball Game: Initializing");
    }

    @Override
    protected void start() {
        System.out.println("Basketball Game: Starting");
    }

    @Override
    protected void end() {
        System.out.println("Basketball Game: Ending");
    }
}
