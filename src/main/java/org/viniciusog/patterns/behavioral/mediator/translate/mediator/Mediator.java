package org.viniciusog.patterns.behavioral.mediator.translate.mediator;

import org.viniciusog.patterns.behavioral.mediator.translate.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Mediator {

    protected Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        System.out.println(String.format("'%s' is in the room", user.getName()));
        users.put(user.getName(), user);
    }

    public void removeUser(User user) {
        System.out.println(String.format("'%s' is out", user.getName()));
        users.remove(user.getName());
    }

    public void sendMessage(String message, User to, User from) {
        // send to all
        if (to == null) {
            for (User user : users.values()) {
                if (Objects.equals(user.getName(), from.getName())) continue;
                user.receiveMessage(getMessage(message, user, from), from);
            }
        } else {
            to.receiveMessage(getMessage(message, to, from), from);
        }
    }

    // necessary so we can have both basic getMessage and translation
    protected abstract String getMessage(String message, User to, User from);
}
