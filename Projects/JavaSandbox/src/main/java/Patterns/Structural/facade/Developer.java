package Patterns.Structural.facade;

public class Developer {
    public void getCode(BugTracker bugTracker){
        if (!bugTracker.isActive()){
            System.out.println("developer is works");
        } else {
            System.out.println("developer is having fun");
        }
    }
}
