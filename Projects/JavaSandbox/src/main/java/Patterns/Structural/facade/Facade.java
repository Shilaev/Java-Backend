package Patterns.Structural.facade;

public class Facade {
    Developer developer = new Developer();
    Solution solution = new Solution();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        solution.doCode();
        bugTracker.startBugTracker();
        developer.getCode(bugTracker);
    }
}
