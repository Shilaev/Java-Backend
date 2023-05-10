package Patterns.Behavioral.chain;

public abstract class Notificator {
    private int priority;
    private Notificator nextNotificator;

    public Notificator(int priority) {
        this.priority = priority;
    }

    public void setNextNotificator(Notificator nextNotificator) {
        this.nextNotificator = nextNotificator;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotificator != null) {
            nextNotificator.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
