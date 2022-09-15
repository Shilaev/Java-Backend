package Patterns.AbstractFactory.Specialists.PC;

import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;

public class PCTester implements Tester {
    @Override
    public void getTest() {
        System.out.println("PC test");
    }
}
