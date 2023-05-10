package Patterns.Behavioral.chain.notificators;

import Patterns.Behavioral.chain.Notificator;

public class SmsNotificator extends Notificator {
    public SmsNotificator(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("sms: " + message);
    }
}
