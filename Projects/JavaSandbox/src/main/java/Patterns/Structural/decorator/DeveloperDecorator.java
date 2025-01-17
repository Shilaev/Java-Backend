package Patterns.Structural.decorator;

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String getCode() {
        return developer.getCode();
    }
}
