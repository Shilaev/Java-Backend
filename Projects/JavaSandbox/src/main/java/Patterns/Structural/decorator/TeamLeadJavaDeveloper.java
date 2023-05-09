package Patterns.Structural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator {

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String getWeekReport() {
        return "week report";
    }

    @Override
    public String getCode() {
        return super.getCode() + " "
                + getWeekReport();
    }
}
