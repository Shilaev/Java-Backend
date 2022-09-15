package Patterns.AbstractFactory.Specialists.Web;

import Patterns.AbstractFactory.SpecialistsInterfaces.Tester;

public class WebTester implements Tester {
    @Override
    public void getTest() {
        System.out.println("web test");
    }
}
