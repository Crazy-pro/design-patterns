package alex.klimchuk.command;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
