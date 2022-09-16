package Patterns.Creational.AbstractFactory.Specialists.PC;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;

public class PCTester implements Tester {
    @Override
    public void getTest() {
        System.out.println("PC test");
    }
}
