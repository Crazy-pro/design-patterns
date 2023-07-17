package alex.klimchuk.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        System.out.printf("A new message in the chat from the %s!\n\n", user.name);
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
