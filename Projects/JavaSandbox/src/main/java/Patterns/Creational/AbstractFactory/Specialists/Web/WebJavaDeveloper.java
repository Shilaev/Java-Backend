package Patterns.Creational.AbstractFactory.Specialists.Web;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;

public class WebJavaDeveloper implements Developer {

    @Override
    public void getCode() {
        System.out.println("web java code");
    }
}
