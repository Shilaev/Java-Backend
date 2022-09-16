package Patterns.Creational.AbstractFactory.Specialists.PC;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Developer;

public class PCJavaDeveloper  implements Developer {
    @Override
    public void getCode() {
        System.out.println("PC java code");
    }
}
