package alex.klimchuk.command;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
