package Patterns.AbstractFactory.Specialists.Web;

import Patterns.AbstractFactory.SpecialistsInterfaces.ProjectManager;

public class WebProjectManager implements ProjectManager {
    @Override
    public void getManagement() {
        System.out.println("web project management");
    }
}
