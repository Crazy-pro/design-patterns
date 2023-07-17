package alex.klimchuk.mediator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
