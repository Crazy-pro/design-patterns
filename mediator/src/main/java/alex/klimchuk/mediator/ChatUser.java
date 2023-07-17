package alex.klimchuk.mediator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }
}
