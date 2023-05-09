package Patterns.Creational.Prototype;

public class ProjectSolution implements Copyable {
    private int id;
    private String solutionName;
    private String sourceCode;

    public ProjectSolution(int id, String projectName, String sourceCode) {
        this.id = id;
        this.solutionName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return "ProjectSolution{" +
                "id=" + id +
                ", solutionName='" + solutionName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        ProjectSolution projectSolutionCopy = new ProjectSolution(
                getId(),
                getSolutionName(),
                getSourceCode()
        );
        return projectSolutionCopy;
    }
}
