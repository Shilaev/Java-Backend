package Patterns.Structural.decorator;

import Patterns.Structural.decorator.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public String getCode() {
        return "Java code";
    }
}
