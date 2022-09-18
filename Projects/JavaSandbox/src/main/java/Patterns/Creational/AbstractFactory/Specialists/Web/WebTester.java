package Patterns.Creational.AbstractFactory.Specialists.Web;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.Tester;

public class WebTester implements Tester {
    @Override
    public void getTest() {
        System.out.println("web test");
    }
}
