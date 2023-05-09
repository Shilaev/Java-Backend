package Patterns.Structural.facade;

public class BugTracker {
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void startBugTracker() {
        System.out.println("bug tracker is active");
        isActive = true;
    }

    public void stopButTracker() {
        System.out.println("bug tracker is stop");
        isActive = false;
    }
}
