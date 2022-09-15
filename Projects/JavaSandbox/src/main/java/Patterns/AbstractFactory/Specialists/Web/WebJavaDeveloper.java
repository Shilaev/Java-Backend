package Patterns.AbstractFactory.Specialists;

import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;

public class WebJavaDeveloper implements Developer {

    @Override
    public void getCode() {
        System.out.println("web java code");
    }
}
