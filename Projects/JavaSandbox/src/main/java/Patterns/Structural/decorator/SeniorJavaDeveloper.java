package Patterns.Structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String getCodeReview() {
        return "code review";
    }

    @Override
    public String getCode() {
        return super.getCode() + " "
                + getCodeReview();
    }
}
