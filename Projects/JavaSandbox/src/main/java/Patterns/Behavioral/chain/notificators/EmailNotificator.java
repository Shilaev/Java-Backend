package Patterns.Behavioral.chain.notificators;

import Patterns.Behavioral.chain.Notificator;

public class EmailNotificator extends Notificator {
    public EmailNotificator(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("email " + message);
    }
}
