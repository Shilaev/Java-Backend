package Patterns.Behavioral.chain.notificators;

import Patterns.Behavioral.chain.Notificator;

public class SimpleReportNotificator extends Notificator {

    public SimpleReportNotificator(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("simple report" + message);
    }
}
