package Patterns.Creational.AbstractFactory.Specialists.Web;

import Patterns.Creational.AbstractFactory.SpecialistsInterfaces.ProjectManager;

public class WebProjectManager implements ProjectManager {
    @Override
    public void getManagement() {
        System.out.println("web project management");
    }
}
