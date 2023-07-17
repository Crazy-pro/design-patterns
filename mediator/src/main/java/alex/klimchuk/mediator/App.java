package alex.klimchuk.mediator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "John");
        User user2 = new ChatUser(mediator, "Jane");
        User user3 = new ChatUser(mediator, "Bob");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello everyone!");
    }
}
