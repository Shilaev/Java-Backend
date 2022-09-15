package Patterns.AbstractFactory.Specialists.PC;

import Patterns.AbstractFactory.SpecialistsInterfaces.Developer;

public class PCJavaDeveloper  implements Developer {
    @Override
    public void getCode() {
        System.out.println("PC java code");
    }
}
