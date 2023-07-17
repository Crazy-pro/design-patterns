package alex.klimchuk.mediator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class User {
    protected final ChatMediator chatMediator;
    protected final String name;

    protected User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
